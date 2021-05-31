package com.epam.lab.business_objects_youTube;

import com.epam.lab.page_objects_youTube.ApplicationPO;

import static com.epam.lab.utils.Constants.LVIV;

public class ApplicationBO {

    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ApplicationBO.class);

    public void openApplication() {
        ApplicationPO applicationPO = new ApplicationPO();
        log.info("Open additional apps on YouTube page");

        applicationPO.getSearchYouTubeVideo().sendText(LVIV);
        applicationPO.getSearchVideo().click();
    }
}
