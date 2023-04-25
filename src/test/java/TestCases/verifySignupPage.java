package TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.TestCaseDAtaforlogin;
import Resources.commonutilities;
import pageobjectmodel.SignUpPageobject;
import pageobjectmodel.loginpageobjectmodel;

public class verifySignupPage extends BaseClass {
	
	@Test
	public void  singuppage() throws InterruptedException  {
		
		 loginpageobjectmodel lpo= new loginpageobjectmodel (driver);
		
		 lpo.clickontryforfree().click();
		 
		 
		 Thread.sleep(5000);
		 
		 
		 //assertion for signup page 
		 String actultitle=driver.getTitle();
		 
		 String expectedtitle = TestCaseDAtaforlogin.expectedtitle;
		 
		  commonutilities.handleAssertion(actultitle, expectedtitle);
		 
		 
		 
		 
		 SignUpPageobject spo=new SignUpPageobject(driver);
		 
		 spo.EnterFirstName().sendKeys(TestCaseDAtaforlogin.firstname);
		 
		 spo.EnterlastName().sendKeys(TestCaseDAtaforlogin.lastname);    //spo.EnterlastName()--------this will return------ //driver.findelement(by.xpath(""));
		 
		 spo.EnterCompanyName().sendKeys("AI.cooprative");
		 
		 spo.Enterjobtitle().sendKeys("software tester");
		 
		 spo.Enterphonenumber().sendKeys("987654321");
		 
		 Select sc=new Select(spo.Enterjobtitle());
		     sc.selectByIndex(1);
		 
		commonutilities.dropdown(spo.EnterEmployee(),1);
	 
		commonutilities.dropdown (spo.EnterCountryname(),4);
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
