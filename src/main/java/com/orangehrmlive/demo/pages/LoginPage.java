package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{
    By enterUserName = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By enterpassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    By admin = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");
    By text = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");
    By logo = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");

    public void setEnterUserName()
    {
        sendTextToElement(enterUserName,"Admin");
    }
    public void setEnterpassword()
    {
        sendTextToElement(enterpassword,"admin123");
    }
    public void click()
    {
        clickOnElement(login);
    }


    public void deshBoardText()
    {
        getTextFromElement(text);
    }

    public void setLogo()
    {
        getTextFromElement(logo);
    }

}
