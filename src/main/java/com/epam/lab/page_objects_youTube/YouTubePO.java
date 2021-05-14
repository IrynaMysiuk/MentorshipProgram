package com.epam.lab.page_objects_youTube;

import com.epam.lab.decorator.NavigationLink;
import com.epam.lab.decorator.TextField;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.epam.lab.singleton.DriverManager.getWait;

public class YouTubePO extends AbstractPO {
    @FindBy(name = "q")
    private TextField searchType;
    @FindBy(xpath = "//h2[contains(text(),'Результати веб-пошуку')]/../div/div/div/div/div/a")
    private NavigationLink youTubeItem;
    @FindBy(xpath = "//ytd-guide-entry-renderer/a[@title='Бібліотека']")
    private NavigationLink libraryItem;
    @FindBy(xpath = "//a[@title='Домашня сторінка YouTube']")
    private WebElement waitTitle;

    public TextField getSearchField() {
        return searchType;
    }

    public NavigationLink getYouTubeItem() {
        return youTubeItem;
    }

    public NavigationLink getLibraryItem() {
        return libraryItem;
    }

    public void waitTitle(String titleText) {
        getWait().until((dr) -> dr.getTitle().startsWith(titleText));
    }

    public void waitYouTubeLogo() {
        getWait().until(ExpectedConditions.visibilityOf(youTubeItem.getElement()));
    }
}
