package lanching12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
WebElement username = driver.findElement(By.id("username"));
WebElement password = driver.findElement(By.id("password"));
username.clear();
password.clear();

	}

}
