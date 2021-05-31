package com.epam.lab.page_objects_youTube;

import com.epam.lab.decorator.FieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.epam.lab.singleton.DriverContainer.getDriver;

public abstract class AbstractPO {
    protected AbstractPO() {
        PageFactory.initElements(new FieldDecorator(getDriver()), this);
    }
}
