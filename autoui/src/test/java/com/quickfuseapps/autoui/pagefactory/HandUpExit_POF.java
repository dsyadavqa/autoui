package com.quickfuseapps.autoui.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HandUpExit_POF {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[@id='module-4']//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")
	public static WebElement elmt_ExitApp4;

	@FindBy(how = How.XPATH, using = "//div[@id='module-5']//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")
	public static WebElement elmt_ExitApp5;

	@FindBy(how = How.XPATH, using = "//div[@id='module-6']//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']")
	public static WebElement elmt_ExitApp6;

	public HandUpExit_POF(WebDriver driver) {
		this.driver = driver;
	}
}
