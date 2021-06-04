package com.epam.mentorshipProgram.page_objects;

import com.epam.mentorshipProgram.decorator.NavigationLink;
import com.epam.mentorshipProgram.decorator.TextField;
import org.openqa.selenium.support.FindBy;

public class ApplicationPO extends AbstractPO {
    @FindBy(xpath = "//input[@id='search']")
    private TextField searchYouTubeVideo;

    @FindBy(xpath = "(//button[@aria-label='Пошук'])[2]")
    private NavigationLink searchVideo;

    public ApplicationPO() {
    }

    public TextField clickSearchYouTubeVideo() {
        return searchYouTubeVideo;
    }

    public NavigationLink clickSearchVideo() {
        return searchVideo;
    }

}
