package wfm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import wfm.qa.base.TestBase;

public class DashboardPage extends TestBase {

    public Actions action = new Actions(driver);

        WebElement settings = driver.findElement(By.xpath("//div[@id='menu']/ul/li[6]/span[@id='7']"));
        WebElement administration = driver.findElement(By.xpath("//div[@id='menu']/ul/li[5]/span[@id='6']"));
        WebElement reports = driver.findElement(By.xpath("//div[@id='menu']/ul/li[4]/span[@id='5']"));
        WebElement issues = driver.findElement(By.xpath("//div[@id='menu']/ul/li[3]/span[@id='3']"));
        WebElement workflows = driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/span[@id='2']"));
        WebElement home = driver.findElement(By.xpath("//div[@id='menu']/ul/li[1]/span[@id='1']"));

        WebElement accountsLink = driver.findElement(By.linkText("Accounts and Groups"));
        WebElement rolesLink = driver.findElement(By.linkText("Roles"));
        WebElement dirServicesLink = driver.findElement(By.linkText("Directory Services"));
        WebElement extWebServicesLink = driver.findElement(By.linkText("External Web Services"));
        WebElement extDataSourcesLink = driver.findElement(By.linkText("External Data Sources"));
        WebElement companiesLink = driver.findElement(By.linkText("Companies"));
        WebElement dirAttributesLink = driver.findElement(By.linkText("Directory Service Attributes"));
        WebElement companyPreferencesLink = driver.findElement(By.linkText("Company Preferences"));

        WebElement projectsLink = driver.findElement(By.linkText("Projects"));
        WebElement templatesLink = driver.findElement(By.linkText("Templates"));
        WebElement approvalsLink = driver.findElement(By.linkText("Approvals"));

        public void clickAccountsLink(){
            action.moveToElement(settings).build().perform();
            action.moveToElement(accountsLink).click().build().perform();
        }
        public void clickRolesLink(){
            action.moveToElement(settings).moveToElement(rolesLink).click().build().perform();
        }
        public void clickDirServicesLink(){
            action.moveToElement(settings).moveToElement(dirServicesLink).click().build().perform();
        }
        public void clickWebServicesLink(){
            action.moveToElement(settings).moveToElement(extWebServicesLink).click().build().perform();
        }
        public void clickDataSourcesLink(){
            action.moveToElement(settings).moveToElement(extDataSourcesLink).click().build().perform();
        }
        public void clickCompaniesLink(){
            action.moveToElement(settings).moveToElement(companiesLink).click().build().perform();
        }
        public void clickDirAttributesLink(){
            action.moveToElement(settings).moveToElement(dirAttributesLink).click().build().perform();
        }
        public void clickCompanyPreferencesLink(){
            action.moveToElement(settings).moveToElement(companyPreferencesLink).click().build().perform();
        }


        public void clickProjectsLink(){
            action.moveToElement(administration).moveToElement(projectsLink).click().build().perform();
        }
        public void clickTemplatesLink(){
            action.moveToElement(administration).moveToElement(templatesLink).click().build().perform();
        }
        public void clickApprovalsLink(){
            action.moveToElement(administration).moveToElement(approvalsLink).click().build().perform();
        }
}

