package wfm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wfm.qa.base.TestBase;

public class LoginPage extends TestBase {

   public void elements(){
       WebElement userName = driver.findElement(By.name("UserName"));
       WebElement password = driver.findElement(By.name("Password"));
       WebElement loginButton = driver.findElement(By.id("btnLogin"));

       userName.sendKeys(prop.getProperty("username"));
       password.sendKeys(prop.getProperty("password"));
       loginButton.click();
   }

}
