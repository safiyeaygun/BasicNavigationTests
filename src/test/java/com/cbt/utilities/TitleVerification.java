package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls =
                Arrays.asList("http://practice.cybertekschool.com/",
                        "http://practice.cybertekschool.com/dropdown",
                        "http://practice.cybertekschool.com/login");


        WebDriver driver = BrowserFactory.getDriver("chrome");


        for(int x =0; x<urls.size(); x++) {

            driver.get(urls.get(x));
            String current = driver.getCurrentUrl();
            Thread.sleep(2000);

    if (urls.get(x).startsWith(current)) {
        System.out.println("PASSED");
    } else {
        System.out.println("FAILED");
    }
}
        String[] titles = new String[urls.size()];

        //Visit all the websites from step 3 and verify that they all have the same title.
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            Thread.sleep(2000);
            titles[i] = driver.getTitle();

        }

        if ((titles[0].equals(titles[1]) && titles[0].equals(titles[2]))) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }



        /*    String [] titles = new String [urls.size()];

      for(int x =0; x<urls.size(); x++) {
          driver.get(urls.get(x));
          Thread.sleep(2000);
          titles[x] = driver.getTitle();

          if ((titles[0].equals(titles[1]) && titles[0].equals(titles[2]))) {
              System.out.println("PASSED");
          } else {
              System.out.println("FAILED");
          }

      }*/
            driver.quit();
}


}
