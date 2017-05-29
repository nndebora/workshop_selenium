package com.dn.samples.workshop_selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by debora on 27/05/2017.
 */
public class Teste {
    @Test
    public void Test1(){
        WebDriver wd;
    }
    public WebElement getFilledFieldByID(WebDriver driver, String value, String id){
        WebElement element = driver.findElement(By.id(id));
        element.sendKeys(value);
        return element;
    }
}
