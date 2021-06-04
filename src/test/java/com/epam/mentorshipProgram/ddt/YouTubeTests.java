package com.epam.mentorshipProgram.ddt;

import com.epam.mentorshipProgram.business_objects.ApplicationBO;
import com.epam.mentorshipProgram.business_objects.YouTubeBO;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.mentorshipProgram.core.DriverContainer.createDriver;
import static com.epam.mentorshipProgram.constants.Constants.URL;

public class YouTubeTests extends BaseTest {
    @Test
    public void mainTest() {
        YouTubeBO youTubeBO = new YouTubeBO();
        Assert.assertTrue(createDriver().getCurrentUrl().contains(URL), "Website has incorrect url");
        youTubeBO.openYouTubePage()
                .openLibraryItem();
        ApplicationBO applicationBO = new ApplicationBO();
        applicationBO.openApplication();
    }
}
