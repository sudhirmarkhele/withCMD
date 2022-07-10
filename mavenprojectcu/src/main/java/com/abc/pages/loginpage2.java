package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.abc.utility.BrowserLaunch;



public class loginpage2 extends BrowserLaunch {
		//@FindBy(id = "txtUsername")
	//	private WebElement username;
		
		public static WebElement getusername(){
			 return driver.findElement(By.id("txtUsername"));
			
		}
		//@FindBy(id="txtPassword")
		//private WebElement txtPassword;
		
		public  static WebElement getPassword(){
		//	return txtPassword;
			return driver.findElement(By.id("txtPassword"));
		}
		
		
			
		public  static WebElement getLogin(){
			//return btnLogin;
			return driver.findElement(By.id("btnLogin"));
			
		}
		
			
	

	}
	



