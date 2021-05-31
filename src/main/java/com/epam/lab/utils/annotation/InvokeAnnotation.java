package com.epam.lab.utils.annotation;


import com.epam.lab.utils.Constants;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeAnnotation {
   private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(InvokeAnnotation.class);
    @Demo.MyAnnotation(value = 10)
    public void sayHello() {
        log.info("hello annotation");
    }

    public void myMethod(String... strings) {
        for (String str : strings) {
            log.info(str);
        }
    }

    public void myMethod(String a, int... args) {
        for (int arg : args) {
            log.info(String.format("%s: %d", a, arg));
        }
    }

    public void getInvoke() {
        Class<?> cls;
        try {
            cls = Class.forName("com.epam.lab.utils.annotation.InvokeAnnotation");
            Method method = cls.getMethod("myMethod", String[].class);
            InvokeAnnotation ownAnnotation = new InvokeAnnotation();
            method.invoke(ownAnnotation, new Object[]{Constants.argStr});
            method = cls.getMethod("myMethod", String.class, int[].class);
            method.invoke(ownAnnotation, Constants.myName, Constants.argInt);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

