package com.epam.mentorshipProgram.business_objects;

import com.epam.mentorshipProgram.page_objects.ApplicationPO;

import static com.epam.mentorshipProgram.constants.Constants.LVIV;

public class ApplicationBO {

    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ApplicationBO.class);

    public void openApplication() {
        ApplicationPO applicationPO = new ApplicationPO();
        log.info("Open additional apps on YouTube page");

        applicationPO.clickSearchYouTubeVideo().sendText(LVIV);
        applicationPO.clickSearchVideo().click();
    }
}
