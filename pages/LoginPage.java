package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage() {
		
	}
	public LoginPage typeUsername(String username) { 
	 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 return this;
	 

	}
	public LoginPage typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
        return new WelcomePage();   
		
		
	}

}
