package com.epam.mentorshipProgram.page_objects;

import com.epam.mentorshipProgram.decorator.NavigationLink;
import com.epam.mentorshipProgram.decorator.TextField;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.epam.mentorshipProgram.core.DriverManager.getWait;

public class YouTubePO extends AbstractPO {
    @FindBy(name = "q")
    private TextField searchType;
    @FindBy(xpath = "(//h3[contains(text(),'YouTube')])[1]")
    private NavigationLink youTubeItem;
    @FindBy(xpath = "//ytd-guide-entry-renderer/a[@title='Бібліотека']")
    private NavigationLink libraryItem;
    @FindBy(xpath = "//a[@title='Домашня сторінка YouTube']")
    private WebElement waitTitle;

    public TextField clickSearchField() {
        return searchType;
    }

    public NavigationLink clickYouTubeItem() {
        return youTubeItem;
    }

    public NavigationLink clickLibraryItem() {
        return libraryItem;
    }

    public void waitTitle(String titleText) {
        getWait().until((dr) -> dr.getTitle().startsWith(titleText));
    }

    public void waitYouTubeLogo() {
        getWait().until(ExpectedConditions.visibilityOf(youTubeItem.getElement()));
    }
}
