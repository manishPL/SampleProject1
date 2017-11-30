package util;

import static util.DriverScript.APP_LOGS;
import static util.DriverScript.CONFIG;
import static util.DriverScript.OR;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Keywords {
	
public WebDriver driver;
	
	
	public String openBrowser(String object,String data){		
		APP_LOGS.debug("Opening browser");
		if(data.equals("Mozilla"))
			
			driver=new FirefoxDriver();
		/*else if(data.equals("IE"))
			driver=new InternetExplorerDriver();
		else if(data.equals("Chrome"))
			driver=new ChromeDriver();*/
		
		long implicitWaitTime=Long.parseLong(CONFIG.getProperty("implicitwait"));
		driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		return Constants.KEYWORD_PASS;

	}
	
	public String navigate(String object,String data){		
		APP_LOGS.debug("Navigating to URL");
		try{
		driver.navigate().to(data);
		}catch(Exception e){
			return Constants.KEYWORD_FAIL+" -- Not able to navigate";
		}
		return Constants.KEYWORD_PASS;
	}
}
