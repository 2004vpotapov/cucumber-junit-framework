package com.gsi.pages;

import com.gsi.utilities.ConfigurationReader;
import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Some_Page {

    public Some_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "***")
    public WebElement nameWebElement;


    }



