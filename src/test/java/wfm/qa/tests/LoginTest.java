package wfm.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
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

    @Test(priority = 1)
    public void login() throws InterruptedException {
        LoginPage lp = new LoginPage();
        lp.elements();
        validate();
    }
    public void validate() throws InterruptedException {
        String expRes = driver.findElement(By.className("dx-dashboard-title-text")).getText();
        Assert.assertEquals(expRes, "Dashboard");
        System.out.println(expRes);
        Thread.sleep(3000);
    }

    /*@AfterTest
    public void tearDown(){
        driver.quit();
    }*/
}
