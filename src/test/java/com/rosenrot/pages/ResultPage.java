package com.rosenrot.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Page {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "mw-page-title-main")
    private WebElement resultPageTitle;

    public boolean isTitleCorrect(String title){
        waitElementVisibility(resultPageTitle);
        return resultPageTitle.isDisplayed() &&
                resultPageTitle.getText().equalsIgnoreCase(title);
    }

    @FindBy(tagName = "a")
    private List<WebElement> anchors;
    
    public void anchorsTextContent(){   

        for (WebElement anchor : anchors) {
            System.out.println(anchor.getText());
            System.out.println("--------------------");
        }
    }

}
