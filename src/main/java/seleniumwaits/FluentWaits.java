package seleniumwaits;//package//

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits { //class//
	
	public static void main(String[] args) { //Main//
		
		WebDriver odriver = new ChromeDriver();
		odriver.get("https://app.hubspot.com/login");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		//Fluent waits is similar to explicit waits//
		
		       //  Wait<WebDriver> wait = new FluentWait<WebDriver>(odriver);
		
		     Wait<WebDriver>wait = new FluentWait<WebDriver>(odriver)
		              
		    		 .withTimeout(Duration.ofSeconds(30l))
		    		 .pollingEvery(Duration.ofSeconds(5L))
		    		 .ignoring(Exception.class);
		     
		          By mail = By.xpath("//input[@type='email']");
		          
		      WebElement m1 = odriver.findElement(mail);
		      m1.sendKeys("abc@gmail.com");
		      
		      String title = odriver.getTitle();
		      System.out.println(title);
		      
		      odriver.quit();
		             
		
		
	}

}
