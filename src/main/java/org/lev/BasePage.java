package org.lev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    protected WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebSite(String url){

        driver.get(url);
        //driver.get("https://tinyurl.com");
    }

    public void closeWebSite(){
        driver.quit();
    }
}
