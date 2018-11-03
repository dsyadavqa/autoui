package com.quickfuseapps.autoui.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.quickfuseapps.autoui.core.Request;
import com.quickfuseapps.autoui.pagefactory.CreateAppPage_POF;
import com.quickfuseapps.autoui.pagefactory.HandUpExit_POF;
import com.quickfuseapps.autoui.pagefactory.LoginPage_POF;
import com.quickfuseapps.autoui.pagefactory.SendAnEmail_POF;
import com.quickfuseapps.autoui.pagefactory.SendAnSMS_POF;
import com.quickfuseapps.autoui.pagefactory.Start_POF;

public class CreateAppTest extends Request {

	@Parameters({ "browser", "os", "url" })
	@BeforeMethod
	public void launchBrowserBeforeMethod(String browser, String os, String url) {
		Request.openBrowser(os, browser);
		Request.getURL(url);
		PageFactory.initElements(driver, LoginPage_POF.class);
		PageFactory.initElements(driver, CreateAppPage_POF.class);
		PageFactory.initElements(driver, Start_POF.class);
		PageFactory.initElements(driver, SendAnSMS_POF.class);
		PageFactory.initElements(driver, SendAnEmail_POF.class);
		PageFactory.initElements(driver, HandUpExit_POF.class);
	}

	@Test
	public void createAppTest() {
		Request.click(LoginPage_POF.btn_CreateAnApp);
		Request.click(CreateAppPage_POF.btn_LetsGetStarted);
		Request.click(CreateAppPage_POF.btn_AddPage);
		Request.sendText(CreateAppPage_POF.txtbx_NewPage, "TestPage");
		Request.click(CreateAppPage_POF.btn_CreateNewPage);
		Request.click(CreateAppPage_POF.lnk_Messaging);
		Request.dragAndDropBy(CreateAppPage_POF.lnk_SendAnSMS, Start_POF.tab_DropableUI);
		Request.dragHoldRelease(Start_POF.elmt_Start, SendAnSMS_POF.elmt_SendAnSMS);
		Request.sendText(SendAnSMS_POF.txtbx_PhoneNumber, "2132132141");
		Request.sendText(SendAnSMS_POF.txtbx_messaging, "Hello World");
		Request.dragAndDropBy(CreateAppPage_POF.lnk_SendAnEmail, SendAnSMS_POF.elmt_NotSent);
		Request.dragHoldRelease(SendAnSMS_POF.elmt_NotSent, SendAnEmail_POF.elmt_SendAnEmail);
		Request.sendText(SendAnEmail_POF.txtbx_SMTPHost, "smtp.gmail.com");
		Request.sendText(SendAnEmail_POF.txtbx_Port, "465");
		Request.sendText(SendAnEmail_POF.txtbx_Username, "abc@gmail.com");
		Request.sendText(SendAnEmail_POF.txtbx_Password, "abcd123");
		Request.sendText(SendAnEmail_POF.txtbx_From, "abc@gmail.com");
		Request.sendText(SendAnEmail_POF.txtbx_To, "xyz@gmail.com");
		Request.sendText(SendAnEmail_POF.txtbx_Subject, "sms not sent");
		Request.sendText(SendAnEmail_POF.txtbx_Message, "SMS to phone no 2132132141 not sent");
		Request.click(CreateAppPage_POF.lnk_Basic);
		Request.dragAndDropBy(CreateAppPage_POF.lnk_HangUpOrExit, SendAnSMS_POF.elmt_Sent);
		Request.dragHoldRelease(SendAnSMS_POF.elmt_Sent, HandUpExit_POF.elmt_ExitApp4);
		Request.dragAndDropBy(CreateAppPage_POF.lnk_HangUpOrExit, SendAnEmail_POF.elmt_Sent);
		Request.dragHoldRelease(SendAnEmail_POF.elmt_Sent, HandUpExit_POF.elmt_ExitApp5);
		Request.dragAndDropBy(CreateAppPage_POF.lnk_HangUpOrExit, SendAnEmail_POF.elmt_NotSent);
		Request.dragHoldRelease(SendAnEmail_POF.elmt_NotSent, HandUpExit_POF.elmt_ExitApp6);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
