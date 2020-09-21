package wfm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wfm.qa.base.TestBase;

public class AccountDetailsPage extends TestBase {

    WebElement companyDropDown = driver.findElement(By.id("CompanyId"));
    WebElement accountName = driver.findElement(By.id("UserName"));
    WebElement statusDropDown = driver.findElement(By.id("Status"));
    WebElement displayName = driver.findElement(By.xpath("//input[@id='DisplayName' and @type='text']"));
    WebElement password = driver.findElement(By.xpath("//input[@class='password' and @id='Password']"));
    WebElement confirmPwd = driver.findElement(By.xpath("//input[@class='password' and @id='ConfirmPassword']"));
    WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
    WebElement confirmEmail = driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
    WebElement location = driver.findElement(By.xpath("//input[@id='Location']"));

    WebElement prjMgr = driver.findElement(By.xpath("//input[@type='checkbox' and @id='97ba7b01-3441-4cc5-b568-cf5902dddafb']"));

    public void createAdminPrjMgrAccount(){


    }
}
