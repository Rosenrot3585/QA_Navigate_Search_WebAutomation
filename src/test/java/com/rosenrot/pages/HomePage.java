package com.rosenrot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }

/**
 * Find the search bar input by id
 */
    @FindBy(id = "searchInput")
    private WebElement searchInput;

    /**
 * Find the search button by classname
 */

    @FindBy(className = "cdx-search-input__end-button")
    private WebElement searchButton;

    public ResultPage searchText(String text){
        searchInput.sendKeys(text);
        searchButton.click();
        return new ResultPage(super.getDriver());
    }
}
