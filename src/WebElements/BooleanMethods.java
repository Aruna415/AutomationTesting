package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		WebElement button =driver.findElement(By.xpath("//div[text()='Log in']"));
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		System.out.println(button.isSelected());
		
	}

}
