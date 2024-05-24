package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
@Test(dataProvider="cred")
public void ToLogin(String username1,String password1) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.instagram.com/");
WebElement username = driver.findElement(By.name("username"));
WebElement passwoed = driver.findElement(By.name("password1"));
username.sendKeys(username1);
WebElement password;
password.sendKeys(password1);
driver.quit();

@DataProvider(name="cred")
public String[][]senddata(){
	String[][]data= {
			{"aruna145@gmail.com","aruna123"},
			{"manvika@gmail.com","manvi123"}
	};
	return data;
}
		}
}