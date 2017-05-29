package com.dn.samples.workshop_selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by debora on 27/05/2017.
 */
public abstract class BasicActions {

    public String getMessageByElementId(WebDriver driver, String id) {

        String message;
        message = driver.findElement(By.id(id)).getText();
        return message;

    }
    public WebElement getFilledFieldByID(WebDriver driver, String value, String id){
        WebElement element = driver.findElement(By.id(id));
        element.sendKeys(value);
        return element;
    }
}
