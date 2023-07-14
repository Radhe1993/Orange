package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
   LoginPage loginPage = new LoginPage();
   ViewSystemUsersPage view = new ViewSystemUsersPage();

   @Test
    public void verifyUserShouldLoginSuccessFully()
   {
       loginPage.setEnterUserName();
       loginPage.setEnterpassword();
       loginPage.click();
       loginPage.deshBoardText();
       String expected = "Dashboard";
       String actual = getTextFromElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]"));
       Assert.assertEquals(actual,expected);
   }
   @Test
    public void VerifyThatTheLogoDisplayOnLoginPage()
   {
       loginPage. setLogo();

   }
   @Test
    public void VerifyUserShouldLogOutSuccessFully()
   {
       view.setEnterUserName();
       view.setEnterpassword();
       view.click();
       view.setApplicationLogo();
       view.setLogin();
       view.setText();
       String expected = "Login";
       String actual = getTextFromElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]"));
       Assert.assertEquals(actual,expected);
   }
}
