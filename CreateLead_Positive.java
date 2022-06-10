package com.leaftaps.ui.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.CreateLeadPage;
import com.leaftaps.ui.pages.HomePage;
import com.leaftaps.ui.pages.LoginPage;
import com.leaftaps.ui.pages.MyLeadPage;
import com.leaftaps.ui.pages.ViewLeadPage;
import com.leaftaps.ui.pages.WelcomePage;

public class CreateLead_Positive  extends ProjectSpecificMethods{
	@BeforeTest
	public void setDat(String excelFileName) {
		 excelFileName="tc002";
	}
	@Test(dataProvider="getData")
	public void tc002(String username,String password,String cName,String fName,String lName) {
		LoginPage page1=new LoginPage().typeUsername(username);
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typecompanyName()
		.typefirstName()
		.typelastName()
		.clickcreatelead()
		.verifyLeadId();
		

		
		
		
		
		
		/*LoginPage page1=new LoginPage()
		page1.typeUsername(username)
		page1.typePassword(password)
		page1.clickLoginButton();
		
		WelcomePage page2= new WelcomePage();
		page2.clickCRMSFA();
		
		HomePage page3=new HomePage();
		page3.clickLeads();
		
		MyLeadPage page4=new MyLeadPage();
		page4.clickCreateLead();
		
		CreateLeadPage page5=new CreateLeadPage();
		page5.typecompanyName();
		page5.typefirstName();
		page5.typelastName();
		page5.clickcreatelead();
		
		ViewLeadPage page6=new ViewLeadPage();
		page6.verifyLeadId();*/
		
		
		
		
		
	}
		
	}
	


