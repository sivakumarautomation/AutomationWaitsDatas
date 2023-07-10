package seleniumwaits; //package//

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaits { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main //
		
		//WebDriverManager.chromedriver().setup();//--->Not Required//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30L));//30 seconds//
		
		  By u1 = By.name("username");
		  
		  By pd1 = By.xpath("//input[@type='password']");
		  
			WebElement un1 = odriver.findElement(u1);
			WebElement pn1 = odriver.findElement(pd1);
			
			un1.sendKeys("Admin");
			pn1.sendKeys("admin123");
			
			Thread.sleep(5000);
			
			odriver.quit();
	}

}
