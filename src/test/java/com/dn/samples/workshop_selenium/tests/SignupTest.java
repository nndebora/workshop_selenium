package com.dn.samples.workshop_selenium.tests;

import com.dn.samples.workshop_selenium.setup.Setup;
import org.junit.Test;

import static com.dn.samples.workshop_selenium.urls.BasePage.LINK_NAME_SINGUP;
import static org.junit.Assert.assertTrue;
import static com.dn.samples.workshop_selenium.actions.SignUpPage.MESSAGE_SIGNED_SUCESS;
/**
 * Created by debora on 27/05/2017.
 */
public class SignupTest extends Setup {

    private String textName;
    private String textEmail;
    private String textPassword;
    private String textConfPassword;

    @Test
    public void shouldSignUPWithSucessful(){

        //given
        textName = "Fulano Silva";
        textEmail = "fulanotest123@test.com";
        textPassword = "Aklmn123@";
        textConfPassword = "Aklmn123@";

        //when
        home.clickOnLinkSignUp(driver, LINK_NAME_SINGUP);
        signup.fillName(driver, textName);
        signup.fillEmail(driver, textEmail);
        signup.fillPaswd(driver, textPassword);
        signup.fillPswdConf(driver, textConfPassword);
        signup.clickButtonSingUp(driver);

        String message = signup.getMessageByElementId(driver, MESSAGE_SIGNED_SUCESS);

        //then
        assertTrue(message.contains(textName));
    }
}
