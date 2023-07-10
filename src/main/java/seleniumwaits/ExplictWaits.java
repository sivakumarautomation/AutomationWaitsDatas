package seleniumwaits; //package//

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaits { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		//Explicit Wait ---> Dynamic Web Element//
		
		WebDriverWait Waits = new WebDriverWait(odriver,Duration.ofSeconds(30L));
		Waits.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		By un1 = By.name("username");
		By pass = By.name("password");
		
		WebElement user = odriver.findElement(un1);
		WebElement pwrd = odriver.findElement(pass);
		
		user.sendKeys(" Admin");
		pwrd.sendKeys(" admin123");
		
		Thread.sleep(4000);
		
		odriver.quit();
		
		
	}

}
