package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import propertyreader.PropertyReader;

public class BaseTest extends Utility
{
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp()
    {
        selectBrowser(browser);
    }

    @AfterMethod
    public void teatDown() {
        //closeBrowser();
    }
}
