package com.dn.samples.workshop_selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by debora on 27/05/2017.
 */
public class SignUpPage extends BasicActions {
    public static final String USERNAME = "user_username";
    public static final String EMAIL = "user_email";
    public static final String PASSWORD = "user_password";
    public static final String PASSWORD_CONF = "user_password_confirmation";
    public static final String NAME_BUTTON_SIGNUP = "commit";
    public static final String MESSAGE_SIGNED_SUCESS =  "auth";

    private WebElement textName;
    private WebElement textEmail;
    private WebElement textPassword;
    private WebElement textConfPassword;
    private WebElement buttonSignup;


    public void fillName(WebDriver driver, String name){
        this.textName = driver.findElement(By.id(USERNAME));
        this.textName.sendKeys(name);
    }
    public void fillEmail(WebDriver driver, String email){
        this.textEmail = driver.findElement(By.id(EMAIL));
        this.textEmail.sendKeys(email);

    }
    public void fillPaswd(WebDriver driver, String pswd){
        this.textPassword = driver.findElement(By.id(PASSWORD));
        this.textPassword.sendKeys(pswd);
    }
    public void fillPswdConf(WebDriver driver, String pswd){
        this.textConfPassword = driver.findElement(By.id(PASSWORD_CONF));
        this.textConfPassword.sendKeys(pswd);
    }
    public void clickButtonSingUp(WebDriver driver){

        this.buttonSignup = driver.findElement(By.name(NAME_BUTTON_SIGNUP));
        this.buttonSignup.click();
    }


}
