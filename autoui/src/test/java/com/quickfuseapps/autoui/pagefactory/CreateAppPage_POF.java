package com.quickfuseapps.autoui.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAppPage_POF {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),\"Let's get started!\")]")
	public static WebElement btn_LetsGetStarted;

	@FindBy(how = How.ID, using = "add-page")
	public static WebElement btn_AddPage;

	@FindBy(how = How.XPATH, using = "//form[@class='unsubmittable']//input[@name='name']")
	public static WebElement txtbx_NewPage;

	@FindBy(how = How.XPATH, using = "//div[@id='create-dialog']/following-sibling::div/button[contains(text(),'Create')]")
	public static WebElement btn_CreateNewPage;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Messaging')]")
	public static WebElement lnk_Messaging;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Messaging')]/parent::h3/following-sibling::div[1]//li[3]")
	public static WebElement lnk_SendAnSMS;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'email')]/parent::li")
	public static WebElement lnk_SendAnEmail;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Basic')]")
	public static WebElement lnk_Basic;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"hangup\")]/parent::li")
	public static WebElement lnk_HangUpOrExit;

	public CreateAppPage_POF(WebDriver driver) {
		this.driver = driver;
	}
}
