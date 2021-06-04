package com.epam.mentorshipProgram.decorator;

import com.epam.mentorshipProgram.utils.Localization;

import static com.epam.mentorshipProgram.core.DriverContainer.createDriver;

public class NavigationLink extends AbstractPageElement {

    public void click() {
        String buttonName = "";
        if (wrappedElement != null) {
            wrappedElement = getWebElementWithWait(WaitCondition.CLICKABLE, wrappedElement);
            buttonName = wrappedElement.getText();
            wrappedElement.click();
        }
        log.debug("Passed to:"
                + createDriver().getCurrentUrl());
        log.info(Localization
                .getMessage(Localization.CLICK_BUTTON, buttonName));
    }


}
