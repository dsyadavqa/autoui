package com.quickfuseapps.autoui.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Start_POF {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[@id='module-1']/div/following-sibling::div[last()]/div")
	public static WebElement elmt_Start;

	@FindBy(how = How.ID, using = "module-1")
	public static WebElement tab_DropableUI;

	public Start_POF(WebDriver driver) {
		this.driver = driver;
	}

}
