package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DobleClicl
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapp.skillrary.com/product.php");
org.openqa.selenium.
WebElement quantity= driver.findElement(By.id("add"));
Actions a = new Actions(driver);
a.doubleClick(quantity).perform();

	}

}
