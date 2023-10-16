package com.rosenrot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //"this" is the object with WebElement and List fields that should be proxied.
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    
    /**
     * Wait for the element to be clickable
     * @param element : WebElement
     * @Rosenrot3585
     */
    public void waitForElementToBeClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Wait for tht element to be visible.
     *
     * @param element : WebElement
     * @Rosenrot3585
     * 
     */
    public void waitElementVisibility(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Static wait, wait in seconds, this wait should be the last option as a wait.
     *
     * @param time : Integer
     * @author f.jimenez
     */
    public void waitSomeSeconds(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Always use wait if possible instead of Thread.sleep, if the action performs before the time 
     * as parameter in sleep, we are wasting value time. For example if an element is clickable in 2s
     * and we waited 20s (Thread.sleep) we are losing 15s per test, after 100 tests we had lost 1500s 
     * (25minutes) that we could use to perfomr more tests.
     */
}

    

