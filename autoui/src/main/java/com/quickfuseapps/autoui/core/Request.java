package com.quickfuseapps.autoui.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Request extends Constant {

	public static WebDriver driver;

	public static void openBrowser(String os, String browser) {
		String driverPath = null;
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");

				if (os.equalsIgnoreCase("Mac")) {
					driverPath = CHROME_DRIVER_PATH_MAC;
				} else if (os.equalsIgnoreCase("Windows")) {
					driverPath = CHROME_DRIVER_PATH_WINDOWS;
				}
				if (driverPath != null) {
					System.setProperty("webdriver.chrome.driver", driverPath);
				} else {
					System.out.println("Please configure os type in pom.xml");
				}
				driver = new ChromeDriver(options);
			} else if (browser.equalsIgnoreCase("FF")) {
				if (os.equalsIgnoreCase("Mac")) {
					driverPath = FF_DRIVER_PATH_MAC;
				} else if (os.equalsIgnoreCase("Windows")) {
					driverPath = FF_DRIVER_PATH_WINDOWS;
				}
				if (driverPath != null) {
					System.setProperty("webdriver.gecko.driver", driverPath);
				} else {
					System.out.println("Please configure os type in pom.xml");
				}
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void getURL(String url) {
		driver.get(url);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void switchToWindow() {
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
	}

	public static void dragAndDropBy(WebElement source, WebElement target) {
		Point classname = target.getLocation();
		Actions act = new Actions(driver);
		act.dragAndDropBy(source, classname.getX() - 87, classname.getY() - 50).build().perform();
		waitPageToLoad(5);

	}

	public static void dragHoldRelease(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		waitPageToLoad(5);
	}

	public static void waitPageToLoad(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

}
