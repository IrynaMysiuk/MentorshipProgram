package com.epam.lab.utils.annotation;


import com.epam.lab.utils.Constants;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static com.epam.lab.utils.Constants.A_VALUE;
import static com.epam.lab.utils.Constants.B_VALUE;

public class UnknownType {

    public static int a;
    public static int b;
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(UnknownType.class);

    UnknownType() {
        UnknownType.a = A_VALUE;
        UnknownType.b = B_VALUE;
    }

    private void printInfo(Field field) throws IllegalArgumentException {
        log.info("name = " + field.getName());
        log.info("decl class = " + field.getDeclaringClass());
        log.info("type = " + field.getType());
        log.info("modifiers = " + Modifier.toString(field.getModifiers()));
    }

    public void getUnknownType() {
        Class<?> cls;
        try {
            cls = Class.forName("com.epam.lab.utils.annotation.UnknownType");
            Field fieldList[] = cls.getDeclaredFields();
            for (int i = 0; i < fieldList.length; i++) {
                if (fieldList[i].getType().equals(int.class)) {
                    fieldList[i].set(cls, Constants.myAge + i);
                }
                printInfo(fieldList[i]);
                log.info("get: " + fieldList[i].get(cls));
            }
        } catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}