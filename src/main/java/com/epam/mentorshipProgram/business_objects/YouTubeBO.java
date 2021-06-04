package com.epam.mentorshipProgram.business_objects;

import com.epam.mentorshipProgram.page_objects.YouTubePO;
import org.openqa.selenium.Keys;

import static com.epam.mentorshipProgram.core.DriverContainer.createDriver;
import static com.epam.mentorshipProgram.constants.Constants.YOUTUBE;

public class YouTubeBO {
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(YouTubeBO.class);

    public YouTubeBO openYouTubePage() {
        YouTubePO youTubePO = new YouTubePO();
        log.info("Check loading Google page");
        youTubePO.clickSearchField().sendText(YOUTUBE);
        youTubePO.clickSearchField().sendText(Keys.ENTER);
        youTubePO.waitYouTubeLogo();
        youTubePO.clickYouTubeItem().click();
        log.info("Page title is:" + createDriver().getTitle());
        youTubePO.waitTitle(YOUTUBE);
        return this;
    }

    public YouTubeBO openLibraryItem() {
        YouTubePO youTubePO = new YouTubePO();
        log.info("Loading library page on YouTube");
        youTubePO.clickLibraryItem().click();
        return this;
    }
}
