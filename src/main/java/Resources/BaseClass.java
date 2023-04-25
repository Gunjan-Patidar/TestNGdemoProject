package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public Properties prop;
	public WebDriver driver;
	public WebDriver browserlaunch() throws IOException { 
	 //help to read data.properties 
		//FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse workspace\\19thapriltestNgframework\\src\\main\\java\\Resources\\data.properties");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");   //this will run in other system
		
	 //java ka class hai to acesse data.properties
	  prop= new Properties(); 
	 //now acesse and can load 
	   prop.load(fis);
	  //but kisko acesse karna hai = chrome ko 
	  
	  String browsername= prop.getProperty("browser");//iska ans chrome ayega
	  //ye dono match hot hai to browser launch hoga
	  
	 if(browsername.equalsIgnoreCase("chrome")) {  
		 
		//	System.setProperty("webdriver.crome.driver", "C:\\Users\\hp\\Desktop\\crome driver\\chromedriver.exe");
		 
		 
		    	WebDriverManager.chromedriver().setup();   //this will run with latest version in your  system
		    	
		    	//WebDriverManager.chromedriver().browserVersion("7.8.3").setup();   //this will run with specific version 
		    	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			 driver=new ChromeDriver(options);
			
	 }
	   else if(browsername.equalsIgnoreCase("firefox")) {
	   }
	  else if(browsername.equalsIgnoreCase("edge")) {
	   }
	 else {
	  System.out.println("please select valid browser");
	   }
	  return driver;// return so type change from void
	  // driver return kar rahe to type webdriver chahiye
	  
	  
	  
	}
	@BeforeMethod // to launch browser before 
	 public void launchBrowser() throws IOException { 
		browserlaunch(); // ye pehele verify login mai dala tha but har bari nhi likh sakte so humne usko yaha common likh liya
	driver.get(prop.getProperty("url"));
	
}
	
	
	@AfterMethod 
	public void teardown() {
		
		driver.quit();
	}
		
}	
	

	 
	

