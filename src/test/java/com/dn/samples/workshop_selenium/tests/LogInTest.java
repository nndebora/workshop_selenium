package com.dn.samples.workshop_selenium.tests;

import com.dn.samples.workshop_selenium.setup.Setup;
import org.junit.Before;
import org.junit.Test;

import static com.dn.samples.workshop_selenium.actions.LogInPage.ID_INVALID_USER_OR_PSWD;
import static com.dn.samples.workshop_selenium.actions.LogInPage.MESSAGE_INVALID_USER_OR_PSWD;
import static com.dn.samples.workshop_selenium.actions.LogInPage.MESSAGE_SIGNED_SUCESS;
import static com.dn.samples.workshop_selenium.urls.BasePage.LINK_NAME_LOGIN;
import static com.dn.samples.workshop_selenium.urls.BasePage.LINK_NAME_LOGOUT;
import static com.dn.samples.workshop_selenium.urls.BasePage.LINK_NAME_SINGUP;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by debora on 28/05/2017.
 */
public class LogInTest extends Setup {

    @Before
    public void setupLoginDetails(){

        //given
        String textName = "Cicrano Silva";
        String textEmail = "cicranotest123@test.com";
        String textPassword = "Alpok876˜";
        String textConfPassword = "Alpok876˜";

        //when
        home.clickOnLinkSignUp(driver,LINK_NAME_SINGUP);
        signup.fillName(driver, textName);
        signup.fillEmail(driver, textEmail);
        signup.fillPaswd(driver,textPassword);
        signup.fillPswdConf(driver,textConfPassword);
        signup.clickButtonSingUp(driver);
        home.clickOnLinkLogout(driver,LINK_NAME_LOGOUT);


    }
    @Test
    public void shouldLogedWithSuccessfulUsingName() {
        //given
        String textName = "Cicrano Silva";
        String textPassword = "Alpok876˜";

        //when
        home.clickOnLinkLogin(driver, LINK_NAME_LOGIN);
        login.fillName(driver, textName);
        login.fillPaswd(driver, textPassword);
        login.clickButtonLogIn(driver);
        String message = login.getMessageByElementId(driver, MESSAGE_SIGNED_SUCESS);
        //then
        assertTrue(message.contains(textName));
    }
    @Test
    public void shouldLogedWithSuccessfulUsingEmail() {
        //given
        String textName = "Cicrano Silva";
        String textEmail = "cicranotest123@test.com";
        String textPassword = "Alpok876˜";

        //when
        home.clickOnLinkLogin(driver, LINK_NAME_LOGIN);
        login.fillName(driver, textEmail);
        login.fillPaswd(driver, textPassword);
        login.clickButtonLogIn(driver);
        String message = login.getMessageByElementId(driver, MESSAGE_SIGNED_SUCESS);
        //then
        assertTrue(message.contains(textName));
    }
    @Test
    public void shouldNotLogedWithInvalidUserOrPswd() {
        //given
        String textEmail = "cicranotest1234@test.com";
        String textPassword = "Alpok876˜";

        //when
        home.clickOnLinkLogin(driver, LINK_NAME_LOGIN);
        login.fillName(driver, textEmail);
        login.fillPaswd(driver, textPassword);
        login.clickButtonLogIn(driver);
        String message = login.getMessageByElementId(driver, ID_INVALID_USER_OR_PSWD);
        //then
        assertEquals(MESSAGE_INVALID_USER_OR_PSWD,message);
    }


    }
