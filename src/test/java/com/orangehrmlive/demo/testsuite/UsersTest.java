package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest
{
    AddUserPage addUserPage = new AddUserPage();
    AdminPage admin = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    @Test
    public  void  adminShouldAddUserSuccessFully()
    {
        addUserPage. setEnterUserName();
        addUserPage.setEnterpassword();
        addUserPage.click();
        addUserPage.admin();
        addUserPage.setTextSU();
        String expected = "System Users";
        String actual = getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
        Assert.assertEquals(actual,expected);
        addUserPage.setAdd();
        addUserPage.setAddUserText();
        String expected1 ="Add User";
        String actual1 = getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]"));
        Assert.assertEquals(actual1,expected1);
        addUserPage.setRole();
        addUserPage.eName();
        addUserPage.setUserName();
        addUserPage.Select ();
        addUserPage. setPassword();
        addUserPage.setConfirm();
        addUserPage.setSave();

    }
    @Test
    public void searchTheUserCreatedAndVerifyIt()
    {
        admin.setEnterUserName();
        admin.setEnterpassword();
        admin.setLogin();
        admin.setAdmin();
        admin.setTextSU();
        String expected = "System Users";
        String actual = getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
        Assert.assertEquals(actual,expected);
        admin.setUserName();
        admin.setRole();
        admin.setSelect();
        admin.setStatus();
        admin.setSelect1();
        admin.setButton();
        admin.setMessage();
        String expected1 = "(1) Record Found";
        String actual1 =getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]"));
        Assert.assertEquals(actual1,expected1);

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully()
    {
        dashboardPage.setEnterUserName();
        dashboardPage.setEnterpassword();
        dashboardPage.setLogin();
        dashboardPage.setAdmin();
        dashboardPage.setTextSU();
        String expected = "System Users";
        String actual = getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
        Assert.assertEquals(actual,expected);
        dashboardPage.setUserName();
        dashboardPage.setRole();
        dashboardPage.setSelect();
        dashboardPage.setStatus();
        dashboardPage.setSelect1();
        dashboardPage.setButton();
        dashboardPage.setMessage();
        String expected1 = "(1) Record Found";
        String actual1 =getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]"));
        Assert.assertEquals(actual1,expected1);
        dashboardPage.setCheckBox();
        dashboardPage. setDelete();
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound()
    {
        homePage.setEnterUserName();
        homePage.setEnterpassword();
        homePage.setLogin();
        homePage.setAdmin();
        homePage.setTextSU();
        String expected = "System Users";
        String actual = getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
        Assert.assertEquals(actual,expected);
        homePage.setUserName();
        homePage.setRole();
        homePage.setSelect();
        homePage.setStatus();
        homePage.setSelect1();
        homePage.setButton();
        homePage.setMessage();
        String expected1 = "No Records Found";
        String actual1 =getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]"));
        Assert.assertEquals(actual1,expected1);


    }

}
