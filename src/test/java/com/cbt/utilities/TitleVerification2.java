
package com.cbt.utilities;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification2 {

    public static void main(String[] args) {

        WebDriver driver =  BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com", "http://westelm.com/");

        driver.manage().window().maximize();



        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            String title = driver.getTitle();
            System.out.println("title = " + title);
            if(urls.get(i).contains(title.toLowerCase().replace(" ","")) ){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
            System.out.println();
        }

        driver.quit();
    }
}