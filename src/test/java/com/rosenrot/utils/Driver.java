package com.rosenrot.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private WebDriver driver;

    /**
     * The property for the paths of the drivers arn't set due they've been
     * set in the system environment variables.
     * @param browser
     * @Rosenrot3585
     */
    public Driver(String browser){
        if ("firefox".equals(browser)){
            driver = new FirefoxDriver();
        }else if ("edge".equals(browser)){
            driver = new EdgeDriver();
        }
        else{
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
