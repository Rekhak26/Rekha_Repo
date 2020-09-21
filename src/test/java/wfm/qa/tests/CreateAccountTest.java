package wfm.qa.tests;

import org.testng.annotations.Test;
import wfm.qa.base.TestBase;
import wfm.qa.pages.AccountAdministrationPage;
import wfm.qa.pages.DashboardPage;

public class CreateAccountTest extends TestBase {

    @Test(priority = 2) //(dependsOnMethods = { "login"})
    public void createAccount(){

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickAccountsLink();

        AccountAdministrationPage accPage = new AccountAdministrationPage();
        accPage.clickAddButton();
    }
}
