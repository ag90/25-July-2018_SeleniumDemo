package SeleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Handling {
	
	WebDriver driver;
	
	@Test
	public void handling() throws InterruptedException, AWTException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("disable-infobars");
		
		driver=new ChromeDriver(chrome);
		driver.manage().window().maximize();
		
		
		
		
		String URL="https://www.irctc.co.in/";
		driver.get(URL);
		
		Actions act=new Actions(driver);
		WebElement Trains=driver.findElement(By.xpath("//a[contains(text(),' TRAINS ')]"));
		
		act.clickAndHold(Trains).build().perform();
		Thread.sleep(1000);
		
		
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Cancel Ticket')]"))).build().perform();
		
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Counter Ticket')]"))).build().perform();
		
		
		Thread.sleep(1000);
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Counter Ticket')]"))).build().perform();
		act.click().build().perform();
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(1000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		act.dragAndDrop(driver.findElement(By.xpath("//span[contains(text(),'Books')]")), 
		driver.findElement(By.xpath("//div[@id='treebox2']"))).build().perform();
		
		
		WebElement drag=driver.findElement(By.xpath("//span[contains(text(),'Magazines')]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='treebox2']"));
		
		
		act.dragAndDrop(drag, drop).build().perform();	
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.freecrm.com/index.html");
		
		
	}

}
