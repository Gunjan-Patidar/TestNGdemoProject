package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.TestCaseDAtaforlogin;
import Resources.commonutilities;
import pageobjectmodel.loginpageobjectmodel;

public class verifylogintestcase extends BaseClass {
	         //we have achieved inheritance 
	@Test
	public void login() throws IOException {  
		
	
		  loginpageobjectmodel lpo= new loginpageobjectmodel (driver);//for call method we create object/ lpo is shortform of=LoginPageObject  // we gave driver here bcoz to give scope to loginpagwobject usko scope nahi tha
		  // jaise humne driver dala error aya so we will use constructor 
		  
		 // added one line for demo purpose 
		  //this line is added for demo 2 
		  
		 lpo.EnterUsername().sendKeys(TestCaseDAtaforlogin.username );//method static hai , or static ko call karne ke liye direct cls ka name diya to call hoti hai //thz will take data from TestCaseDataforlogin here we hide hardcoded data
		  lpo.EnterPassword().sendKeys(TestCaseDAtaforlogin.password);
		lpo.clicklogin().click();
		
		
		//String Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String Expected=TestCaseDAtaforlogin.Expectedtext;  //hide data 
		
		String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
	/*	SoftAssert sa=new SoftAssert();
		
	//	sa.assertEquals(actual,Expected);
	//	sa.assertAll();
		*/
		
		commonutilities.handleAssertion(actual,Expected);
	} 
}
