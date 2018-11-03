package com.quickfuseapps.autoui.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendAnSMS_POF {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[@id='module-2']//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")
	public static WebElement elmt_SendAnSMS;

	@FindBy(how = How.XPATH, using = "//textarea[@name='phone_constant']")
	public static WebElement txtbx_PhoneNumber;

	@FindBy(how = How.XPATH, using = "//tbody//div[@class='syn-selectappvar-wrap']//textarea[@name='message_phrase[]']")
	public static WebElement txtbx_messaging;

	@FindBy(how = How.XPATH, using = "//div[@id='module-2']//div[contains(text(),'Not sent')]/preceding-sibling::div[4]")
	public static WebElement elmt_NotSent;

	@FindBy(how = How.XPATH, using = "//div[@id='module-2']//div[contains(text(),'Not sent')]/preceding-sibling::div[5]")
	public static WebElement elmt_Sent;

	public SendAnSMS_POF(WebDriver driver) {
		this.driver = driver;
	}
}
