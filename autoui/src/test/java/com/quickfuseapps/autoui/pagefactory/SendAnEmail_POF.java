package com.quickfuseapps.autoui.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendAnEmail_POF {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[@id='module-3']//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")
	public static WebElement elmt_SendAnEmail;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'SMTP Host:')]/following-sibling::div/input")
	public static WebElement txtbx_SMTPHost;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Port')]/following-sibling::div/input")
	public static WebElement txtbx_Port;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Username')]/following-sibling::div/input")
	public static WebElement txtbx_Username;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Password')]/following-sibling::div/input")
	public static WebElement txtbx_Password;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'From')]/following-sibling::div//textarea")
	public static WebElement txtbx_From;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'To')]/following-sibling::div//textarea")
	public static WebElement txtbx_To;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Subject')]/following-sibling::div//textarea")
	public static WebElement txtbx_Subject;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'panel-subsection')]//tbody//div[contains(@class,'syn-selectappvar-wrap')]//textarea[contains(@name,'message_phrase[]')]")
	public static WebElement txtbx_Message;
	
	@FindBy(how = How.XPATH, using = "//div[@id='module-3']//div[contains(text(),'Not sent')]/preceding-sibling::div[5]")
	public static WebElement elmt_Sent;
	
	@FindBy(how = How.XPATH, using = "//div[@id='module-3']//div[contains(text(),'Not sent')]/preceding-sibling::div[4]")
	public static WebElement elmt_NotSent;

	public SendAnEmail_POF(WebDriver driver) {
		this.driver = driver;
	}
}
