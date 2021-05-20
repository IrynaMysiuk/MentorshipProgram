package com.epam.lab.business_objects_youTube;

import com.epam.lab.page_objects_youTube.ApplicationPO;

public class ApplicationBO {
    public static final String LVIV = "Lviv";
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ApplicationBO.class);

    public void openApplication() {
        ApplicationPO applicationPO = new ApplicationPO();
        log.info("Open additional apps on YouTube page");
        applicationPO.getSearchYouTubeVideo().sendText(LVIV);
    }
}
