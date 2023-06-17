package org.lev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage extends Base{

    By closeCookiesButton = By.xpath("//button[@type='button' and @class='close']");

    public void closeCookies(){
        WebElement closeCookiesBtnElement = driver.findElement(closeCookiesButton);
    }
}
