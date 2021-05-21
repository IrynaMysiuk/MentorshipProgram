package com.epam.lab.page_objects_youTube;

import com.epam.lab.decorator.NavigationLink;
import com.epam.lab.decorator.TextField;
import org.openqa.selenium.support.FindBy;

public class ApplicationPO extends AbstractPO {
    @FindBy(xpath = "//input[@id='search']")
    private TextField searchYouTubeVideo;

    @FindBy(xpath = "(//button[@aria-label='Пошук'])[2]")
    private NavigationLink searchVideo;

    public ApplicationPO() {
    }

    public TextField getSearchYouTubeVideo() {
        return searchYouTubeVideo;
    }

    public NavigationLink getSearchVideo() {
        return searchVideo;
    }

}
