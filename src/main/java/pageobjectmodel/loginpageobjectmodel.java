package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobjectmodel {

	public WebDriver  driver; 
	//driver.findElement(By.xpath("").sendkeys(); 
	// we have achieved encapsulation here 
	private By username = By.xpath("//input[@id='username']"); //declare private-use-encapsulation-opps concept
	  private By password = By.xpath("//input[@id='password']"); //private access within that class only 
	  private By LoginButton=By.xpath("//input[@id='Login']");
	  private By tryforfree=By.xpath("//a[@id='signup_link']");
	              
	
	
	
	
	
	
	
	
	public loginpageobjectmodel(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	
	public WebElement EnterUsername() {//enterusername mai kya ayega =  driver.findElement(username);  
		  return driver.findElement(username);  
		  //need to return so remove void above
	}
	
		   public WebElement EnterPassword() {
		    return driver.findElement(password);
		 }
		   
		   public WebElement clicklogin() {
			    return driver.findElement(LoginButton);
			 }
		   
		   
		   public WebElement clickontryforfree() {
			    return driver.findElement( tryforfree);
			 }
	  
}
