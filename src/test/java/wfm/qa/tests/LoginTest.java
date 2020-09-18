package wfm.qa.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wfm.qa.base.TestBase;
import wfm.qa.pages.LoginPage;

public class LoginTest extends TestBase {

    @BeforeTest
    public void setup(){
        TestBase.initialization();
    }

    @Test
    public void login(){

        LoginPage lp = new LoginPage();
        lp.elements();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
