package com.dn.samples.workshop_selenium.setup;


import com.dn.samples.workshop_selenium.actions.HomePage;
import com.dn.samples.workshop_selenium.actions.LogInPage;
import com.dn.samples.workshop_selenium.actions.SignUpPage;
import com.dn.samples.workshop_selenium.urls.BasePage;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static io.restassured.RestAssured.get;

import java.util.concurrent.TimeUnit;


/**
 * Created by debora on 27/05/2017.
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public abstract class Setup {

    public static WebDriver driver;
    public HomePage home = new HomePage();
//    public BookDetails bookDet = new BookDetails();
    public SignUpPage signup = new SignUpPage();
    public LogInPage login = new LogInPage();
//    public MyCartPage mycart = new MyCartPage();
//    public DashboardsPage dash = new DashboardsPage();
//    public OrdersPage order = new OrdersPage();


    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BasePage.BASE_URL);
    }


    @After
    public void tearDown(){
        get(BasePage.BASE_URL + BasePage.SEED_ENDPOINT).then().statusCode(200);
        driver.quit();
    }
}
