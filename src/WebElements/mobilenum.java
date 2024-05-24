package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshot.WebElement;

public class mobilenum {

	public static void main(String[] args) {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.dream11.com/");
driver.switchTo().frame("send-sms-ifram");
 driver.findElement(By.id("regemail")).sendKeys("9160194150");
 driver.switchTo().defaultContent();

	}

}
