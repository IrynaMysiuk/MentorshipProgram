package com.epam.mentorshipProgram.ddt;

import com.epam.mentorshipProgram.ListenerTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import java.util.Iterator;

import static com.epam.mentorshipProgram.core.DriverContainer.quitDriver;

@Listeners(ListenerTest.class)
public class BaseTest {

    @DataProvider(name = "currentDataProvider", parallel = true)
    protected Iterator<Object[]> initUsers() {
        XLSReader xslReader = new XLSReader();
        return xslReader.readXSLfile().stream().map(email -> new Object[]{email}).parallel().iterator();
    }

    @AfterMethod(alwaysRun = true)
    protected void closeDriver() {
        quitDriver();
    }
}
