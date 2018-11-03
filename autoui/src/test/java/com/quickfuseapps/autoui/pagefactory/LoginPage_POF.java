package com.quickfuseapps.autoui.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_POF {

	WebDriver driver;

	@FindBy(how = How.ID, using = "link-create")
	public static WebElement btn_CreateAnApp;

	public LoginPage_POF(WebDriver driver) {
		this.driver = driver;
	}

}
