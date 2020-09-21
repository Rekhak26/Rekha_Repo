package wfm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wfm.qa.base.TestBase;

public class AccountAdministrationPage extends TestBase {

        WebElement addButton = driver.findElement(By.xpath("//input[@type='button' and @value='Add']"));

        public void clickAddButton(){
            addButton.click();
    }
}
