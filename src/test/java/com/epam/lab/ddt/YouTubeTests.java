package com.epam.lab.ddt;

import com.epam.lab.business_objects_youTube.ApplicationBO;
import com.epam.lab.business_objects_youTube.YouTubeBO;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.lab.singleton.DriverContainer.getDriver;
import static com.epam.lab.utils.Constants.URL;

public class YouTubeTests extends BaseTest {
    @Test
    public void mainTest() {
        YouTubeBO youTubeBO = new YouTubeBO();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(URL), "Website has incorrect url");
        youTubeBO.openYouTubePage()
                .openLibraryItem();
        ApplicationBO applicationBO = new ApplicationBO();
        applicationBO.openApplication();
    }
}
