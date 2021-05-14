package com.epam.lab.page_objects_youTube;

import com.epam.lab.decorator.NavigationLink;
import com.epam.lab.decorator.TextContainer;
import org.openqa.selenium.support.FindBy;

public class ApplicationPO extends AbstractPO {
    @FindBy(xpath = "//button[@aria-label='Додатки YouTube']")
    private NavigationLink appsButton;

    @FindBy(xpath = "//yt-formatted-string[contains(text(),'YouTube TV')]")
    private TextContainer youTubeTVItem;

    public NavigationLink getAppsButton() {
        return appsButton;
    }
    public TextContainer getYouTubeTVItem(){
        return youTubeTVItem;
    }
}
