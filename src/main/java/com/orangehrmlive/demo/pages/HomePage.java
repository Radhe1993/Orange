package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By enterUserName = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By enterpassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    By admin = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");
    By textSU = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By role = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By select = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By status = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By select1 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By button = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");
    By message = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]");


    public void setEnterUserName()
    {
        sendTextToElement(enterUserName,"Admin");
    }
    public void setEnterpassword()
    {
        sendTextToElement(enterpassword,"admin123");
    }
    public void setLogin()
    {
        clickOnElement(login);
    }
    public void setAdmin()
    {
        //click On "Admin" Tab
        clickOnElement(admin);

    }
    public void setTextSU()
    {
        //Verify "System Users" Text
        getTextFromElement(textSU);
    }
    public void setUserName()
    {
        sendTextToElement(userName,"Harry");
    }
    public void setRole()
    {
        clickOnElement(role);
    }
    public void setSelect()
    {
        clickOnElement(select);
    }
    public void setStatus()
    {
        clickOnElement(status);
    }
    public void setSelect1()
    {
        clickOnElement(select1);
    }
    public void setButton()
    {
        clickOnElement(button);
    }
    public void setMessage()
    {
        getTextFromElement(message);
    }

}
