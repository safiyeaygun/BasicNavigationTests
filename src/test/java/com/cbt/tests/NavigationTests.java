package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(titleGoogle, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(titleEtsy, driver.getTitle());

        driver.quit();


    }




}
