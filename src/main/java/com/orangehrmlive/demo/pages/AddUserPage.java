package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility
{
    By enterUserName = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By enterpassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    By admin = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");
    By textSU = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    By add = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    By addUserText = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]");
    By role = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");

    By eNeme = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    By status = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By select = By.xpath("//div[contains(text(),'Disabled')]");
    By password = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By confirm = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By save = By.xpath("//div[contains(text(),'Admin')]");


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

    public void admin()
    {
        //click On "Admin" Tab
        clickOnElement(admin);

    }

    public void setTextSU()
    {
        //Verify "System Users" Text
        getTextFromElement(textSU);
    }
    public void setAdd()
    {
        //click On "Add" button
        clickOnElement(add);
    }
    public void setAddUserText()
    {
        //Verify "Add User" Text
        getTextFromElement(addUserText);
    }
    public void setRole()
    {
        //	Select User Role "Admin"
        sendTextToElement(role,"Admin");

    }

    public void eName()
    {
        //enter Employee Name "Ananya Dash"
        sendTextToElement(eNeme,"Paul Collings");

    }
    public void setUserName()
    {
        //enter Username
        sendTextToElement(userName,"prime@gmail.com");
    }
    public void setStatus()
    {
        clickOnElement(status);
    }
    public void Select ()
    {
        //Select status "Disable
       clickOnElement(select);
    }
    public void setPassword()
    {
        //enter psaaword
        sendTextToElement(password,"prime12345");
    }
    public void setConfirm()
    {
        //enter Confirm Password
        sendTextToElement(confirm,"prime12345");
    }
    public void setSave()
    {
        //click On "Save" Button
        clickOnElement(save);
    }
}
