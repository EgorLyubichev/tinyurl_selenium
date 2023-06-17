package org.lev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBasePage {

    @Test
    public void testTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tinyurl.com");
        By cookiesCloseButton =
                By.xpath("//button[@type='button' and @class='close']");
        WebElement cookieCloseBtnElement = driver.findElement(cookiesCloseButton);
        cookieCloseBtnElement.click();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
        driver.quit();
    }
}
