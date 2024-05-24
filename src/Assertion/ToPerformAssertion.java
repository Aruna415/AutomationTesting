package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToPerformAssertion {

	public static void main(String[] args, String ExpectedResult) {
String ExpectedResult1=" ";
        WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("Women")).click();
		
        Assert.assertEquals(ExpectedResult1, driver.getTitle(),"Our driver control is not landed properly on womenpage");
	
	}

}
