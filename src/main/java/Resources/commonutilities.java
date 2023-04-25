package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonutilities {
	
	
	//this is common method for dropdown
	public static void dropdown(WebElement dropdownxpath,int dropdownvalue) { //we are passing to parameter 
		                                    //if we want to use selectbyvalue mathod or SelectByvisibletext method so change parameter type int to string 
		 Select s=new Select(dropdownxpath);
		 s.selectByIndex(dropdownvalue);
		 
		 
		}	 
	
		
		public static void  handleAssertion(String actual, String Expected) {
			
			//String Expected="Please check your username . If you still can't log in, contact your Salesforce administrator.";
			
			//String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
			
			SoftAssert sa=new SoftAssert();
			
			sa.assertEquals(actual, Expected);
		
		sa.assertAll();
			
			
		}
		
		
		
		
		
	

}
