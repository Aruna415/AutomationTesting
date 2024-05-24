package lanching12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aruna {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");       
	Thread.sleep(2000);
	       driver.findElement(By.name("usename")).sendKeys("aruna.c.415");
	       driver.findElement(By.name("password")).sendKeys("aruna415");
	       driver.findElement(By.linkText("//div['text()=login']")).submit();

	}

}
