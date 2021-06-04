package com.epam.mentorshipProgram.page_objects;

import com.epam.mentorshipProgram.decorator.FieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.epam.mentorshipProgram.core.DriverContainer.createDriver;

public abstract class AbstractPO {
    protected AbstractPO() {
        PageFactory.initElements(new FieldDecorator(createDriver()), this);
    }
}
