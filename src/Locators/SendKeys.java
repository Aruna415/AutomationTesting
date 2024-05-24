package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshot.WebElement;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		WebElement email=(WebElement) driver.findElement(By.id("email"));
		WebElement password=(WebElement) driver.findElement(By.id("pass"));
		((org.openqa.selenium.WebElement) email).sendKeys("Aruna");
		((org.openqa.selenium.WebElement) email).sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		((org.openqa.selenium.WebElement) email).sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		((org.openqa.selenium.WebElement) password).sendKeys(Keys.CONTROL+"V");
			

	}

}
