package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage() {
		
	}
	public ViewLeadPage verifyLeadId() {
		String leadId=driver.findElement(By.id("view Lead_companyName_sp")).getText().replaceAll("^0-9", "leadId");
		System.out.println(leadId);
		return this;
		
	}

}
