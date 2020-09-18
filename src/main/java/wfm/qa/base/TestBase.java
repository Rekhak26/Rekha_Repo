package wfm.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import wfm.qa.util.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Rkaregowda\\IdeaProjects\\TestWithMaven\\src\\main" +
                    "\\java\\wfm\\qa\\config\\config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }/*else{
            System.setProperty("webdriver.gecko.driver", "D:\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }*/

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }
}
