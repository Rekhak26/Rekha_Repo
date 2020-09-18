package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class New {

    public static void main(String[] args) throws InterruptedException {
        New n = new New();
        n.check();
    }
    public void check() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("http://10.80.148.144:81");
        driver.findElement(By.name("UserName")).sendKeys("admin@servicer.com");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        WebElement administration = driver.findElement(By.xpath("//div[@id='menu']/ul/li[5]/span[@id='6']"));
        action.moveToElement(administration).build().perform();
        WebElement templates = driver.findElement(By.linkText("Templates"));
        action.moveToElement(templates).click().build().perform();
        driver.findElement(By.xpath("//input[@type='button' and @class='btn md default' and @value='Add']")).click();
        String actualPageTitle = driver.findElement(By.xpath("//div[@class='edit-header']/h1[@class='edit-title']")).getText();
        String expPageTitle = "template details";
        System.out.println(actualPageTitle);
        if(actualPageTitle.equalsIgnoreCase(expPageTitle))
        {
            driver.findElement(By.xpath("//input[@id='TemplateName']")).sendKeys("Template 01");
            driver.findElement(By.xpath("//div[@id='templatecommand']/div/button[@data-posturl='/Template/UpdateTemplate']")).click();
            Thread.sleep(3000);
            String buttonText = driver.findElement(By.xpath("//div[@id='templatecommand' and @class='span']/div/button[@class='btn md default']")).getText();
            System.out.println(buttonText);
            if(buttonText.equalsIgnoreCase("update")) {
                String actualMsg = driver.findElement(By.xpath("//div[@class='system-confirmation system-confirmation-absolute']/div[@class='message-content']")).getText();
                System.out.println(actualMsg);
            }
            else if(buttonText.equalsIgnoreCase("create")) {
                String validationMessage = driver.findElement(By.xpath("//span[@class='field-validation-error']")).getText();
                System.out.println(validationMessage);
            }
            else
            {
                System.out.println("Nothing");
            }
            driver.findElement(By.xpath("//div[@class='tab-container clearfix']/ul/li[2]/a[@id='tab1']")).click();

            driver.findElement(By.xpath("//input[@id='WFMajorItemName']")).sendKeys("Phase 1");
            driver.findElement(By.xpath("//div[@id='templatecommand']/div/button[@data-posturl='/Template/UpdateTemplatePhase']")).click();
            Thread.sleep(3000);

            WebElement add = driver.findElement(By.xpath("//div[@class='span']/div[2]/div[@id='tabLayout']/div[@id='navLayout' and @class='span4']/div[@id='dropdownbutton']/div[@class='btndrodown dropdown-open']"));
            action.moveToElement(add).build().perform();

            action.moveToElement(add).build().perform();
            driver.findElement(By.xpath("//div[@id='addPhase']/ul/li[2]/div[@id='ddpsubitem']")).click();
            driver.findElement(By.xpath("//input[@id='WFMinorItemDesc']")).sendKeys("Step 1");
            driver.findElement(By.xpath("//div[@id='templatecommand']/div/button[@data-posturl='/Template/UpdateTemplateStep']")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//div[@class='tab-container clearfix']/ul/li[3]/a[@id='tab2']")).click();
            driver.findElement(By.xpath("//input[@id='DataMajorItemName']")).sendKeys("Group 1");
            driver.findElement(By.xpath("//div[@id='templatecommand']/div/button[@data-posturl='/Template/UpdateTemplateDataGroup']")).click();
            Thread.sleep(3000);

            action.moveToElement(add).build().perform();
            driver.findElement(By.xpath("//div[@id='addData']/ul/li[2]/div[@id='ddpsubitem']")).click();
            driver.findElement(By.xpath("//input[@id='DataMinorItemDesc']")).sendKeys("Element 1");
            driver.findElement(By.xpath("//input[@id='DataMinorItemInternalDesc']")).sendKeys("Element 1");
            driver.findElement(By.xpath("//div[@id='templatecommand']/div/button[@data-posturl='/Template/UpdateTemplateDataElement']")).click();
            Thread.sleep(3000);

            action.moveToElement(driver.findElement(By.xpath("//img[@class='padleft']"))).moveToElement(driver.findElement(By.xpath("" +
                    "//span[@id='imgTestTemplate']/ul/li[2]/div[@id='ddValidateTemplate']"))).click().build().perform();

            System.out.println("Execution Completed.");

        }

    }
}
