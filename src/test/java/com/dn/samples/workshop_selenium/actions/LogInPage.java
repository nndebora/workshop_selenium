package com.dn.samples.workshop_selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by debora on 27/05/2017.
 */
public class LogInPage extends BasicActions {
    public static final String USERNAME = "login";
    public static final String PASSWORD = "password";
    public static final String NAME_BUTTON_SIGNIN = "commit";
    public static final String MESSAGE_SIGNED_SUCESS =  "auth";
    public static final String ID_INVALID_USER_OR_PSWD= "flash_error";
    public static final String MESSAGE_INVALID_USER_OR_PSWD="Invalid login or password.";
    private WebElement textName;
    private WebElement textPassword;
    private WebElement buttonSignIn;


    public void fillName(WebDriver driver, String name){
        this.textName = driver.findElement(By.id(USERNAME));
        this.textName.sendKeys(name);
    }
    public void fillPaswd(WebDriver driver, String pswd){
        this.textPassword = driver.findElement(By.id(PASSWORD));
        this.textPassword.sendKeys(pswd);
    }
    public void clickButtonLogIn(WebDriver driver){

        this.buttonSignIn = driver.findElement(By.name(NAME_BUTTON_SIGNIN));
        this.buttonSignIn.click();
    }


}
