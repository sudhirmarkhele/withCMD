package com.abc.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
public static	WebDriver driver;


	public void launch() {
		BrowserLaunch obj=new BrowserLaunch();
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
