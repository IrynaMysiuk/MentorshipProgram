package com.epam.lab.page_objects_youTube;

import com.epam.lab.decorator.NavigationLink;
import com.epam.lab.decorator.TextContainer;
import com.epam.lab.decorator.TextField;
import org.openqa.selenium.support.FindBy;

public class ApplicationPO extends AbstractPO {
    @FindBy(xpath = "//input[@id='search']")
    private TextField searchYouTubeVideo;

    public TextField getSearchYouTubeVideo() {
        return searchYouTubeVideo;
    }
}
