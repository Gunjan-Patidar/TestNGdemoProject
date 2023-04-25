package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageobject {

	
	public WebDriver driver;
	
	 private By fristName=By.xpath("//input[@name='UserFirstName']");
	 private By  lastName=By.xpath("//input[@name='UserLastName']");
	  private By EmailName = By.xpath("//input[@name='UserEmail']");
	private By CompanyName=By.xpath("//input[@name='CompanyName']");
	private By phonenumber=By.xpath(" //input[@name='UserPhone']")  ;                    
	private By jobTitle = By.xpath("//select[@name='UserTitle']");
	private By Employeesname=By.xpath("//select[@name='CompanyEmployees']");
	private By country =By.xpath("//select[@name='CompanyCountry']");
	
	  
	  public SignUpPageobject(WebDriver driver2) {
		  
		  this.driver=driver2;
	  }
	  
	  
	  public WebElement EnterFirstName() {
		  return driver.findElement(fristName);
		  
	  }
		 
	  public WebElement EnterlastName() {
		  return driver.findElement(lastName);
		  
	  }
		
	  public WebElement Enteremailadd() {
		  return driver.findElement(EmailName);
		  
	  }
		
		
	  public WebElement EnterCompanyName() {
		  return driver.findElement(CompanyName);
		  
	  }
		
	
	  public WebElement Enterphonenumber() {
		  return driver.findElement(phonenumber);
		  
	  }
	  
	
	  
	  public WebElement Enterjobtitle() {
		  return driver.findElement(jobTitle);
		  
	  }
	  
	  
	  public WebElement EnterEmployee() {
		  return driver.findElement(Employeesname);
		  
	  }
	  
	  public WebElement EnterCountryname() {
		  return driver.findElement(country);
		  
	  }
}
