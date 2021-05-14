package com.epam.lab.business_objects_youTube;

import com.epam.lab.page_objects_youTube.YouTubePO;
import org.openqa.selenium.Keys;

import static com.epam.lab.singleton.DriverContainer.getDriver;
import static com.epam.lab.utils.Constants.YOUTUBE;

public class YouTubeBO {
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(YouTubeBO.class);

    public YouTubeBO openYouTubePage() {
        YouTubePO youTubePO = new YouTubePO();
        log.info("Check loading Google page");
        youTubePO.getSearchField().sendText(YOUTUBE);
        youTubePO.getSearchField().sendText(Keys.ENTER);
        youTubePO.waitYouTubeLogo();
        youTubePO.getYouTubeItem().click();
        log.info("Page title is:" + getDriver().getTitle());
        youTubePO.waitTitle(YOUTUBE);
        return this;
    }

    public YouTubeBO openLibraryItem() {
        YouTubePO youTubePO = new YouTubePO();
        log.info("Loading library page on YouTube");
        youTubePO.getLibraryItem().click();
        return this;
    }
}
