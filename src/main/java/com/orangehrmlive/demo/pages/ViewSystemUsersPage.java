package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility
{
    By enterUserName = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By enterPassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    By applicationLogo = By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]");
    By logOut = By.xpath("//a[contains(text(),'Logout')]");
    By text = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]");

    public void setEnterUserName()
    {
        sendTextToElement(enterUserName,"Admin");
    }
    public void setEnterpassword()
    {
        sendTextToElement(enterPassword,"admin123");
    }
    public void click()
    {
        clickOnElement(login);
    }
    public void setApplicationLogo()
    {
        clickOnElement(applicationLogo);
    }
    public void setLogin()
    {
        clickOnElement(logOut);
    }
    public void setText()
    {
        getTextFromElement(text);
    }
}
