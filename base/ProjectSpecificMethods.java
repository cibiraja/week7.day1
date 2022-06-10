package com.leaftaps.ui.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.ui.utility.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ProjectSpecificMethods {
		public RemoteWebDriver driver;
		@BeforeMethod
		public void startbrowser() {
			WebDriverManager.chromedriver().setup();
			driver.get("http://leafground.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
		}
		@AfterMethod
		public void endBrwoser() {
			driver.close();
		}
		@DataProvider
		public String[][] getData() throws IOException  {
			
			String[][] readData = ReadExcelData.readData("tc002");
			return readData;
		}



	}

