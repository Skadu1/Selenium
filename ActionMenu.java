package One;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMenu {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver= new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://krninformatix.com/");
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement Branches= driver.findElement(By.xpath("//span[text()='Branches']"));
		 
		 Actions act= new Actions(driver);
		 
		 act.moveToElement(Branches).perform();
		 
		 
		 WebElement ma= driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		 act.moveToElement(ma).perform();
		 
		 WebElement Sel= driver.findElement(By.xpath("//a[contains(text(),'Selenium-Training-in-Mara')]"));
		 
		 act.moveToElement(Sel).perform();
		 
	
		 
		 
	 
		 //Thread.sleep(3000);
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(3000);
		 act.contextClick().perform();
		 
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		 
		Thread.sleep(3000);
		 act.sendKeys(Keys.ENTER).perform();
		 
		 
		 
	}

}
