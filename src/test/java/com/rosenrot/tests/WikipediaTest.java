package com.rosenrot.tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.rosenrot.pages.HomePage;
import com.rosenrot.pages.ResultPage;

public class WikipediaTest extends WebTest {

    @Test
    @Parameters({"expectedTitle" })
    public void searchTest(String expectedTitle){
        HomePage home = loadFirstPage(); 
        System.out.println("Text to Search: " + expectedTitle);

        ResultPage results = home.searchText(expectedTitle);

        assertTrue(results.isTitleCorrect(expectedTitle), "The title does not match '"+ expectedTitle + "'" );

        results.anchorsTextContent();
    }
}