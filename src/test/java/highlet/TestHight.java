package highlet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHight {
	 WebDriver driver;
		// TODO Auto-generated method stub
		@Test
		 public void highlightElement() throws Throwable {
		
			        //Instantiating driver object
			 WebDriver driver = new ChromeDriver();
			        //To launch gmail.com
			 driver.get("https://www.google.fr/");
			 driver.manage().window().maximize();
			        //Collects the webelement

			 WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
			 
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		
			 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
			 Thread.sleep(2000);
			 js.executeScript("arguments[0].setAttribute('style', 'background:; border: 0px ;');", ele);
		
			 
			 Thread.sleep(2000);
			 WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_g']"));
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 js1.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", gmail);
			 Thread.sleep(2000);
			 WebElement img = driver.findElement(By.xpath("//a[@class='gb_g' and @data-pid='2']"));
			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 js2.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", img);
			 Thread.sleep(2000);
			 driver.close();
			 driver.quit();
			
		}
	}

	

