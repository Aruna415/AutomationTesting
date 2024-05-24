package lanching12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zeptonow.com/");
        Navigation navigate = driver.navigate();
        navigate.to("https://blinkit.com/");
        Thread.sleep(2000);
        navigate.back();   
        Thread.sleep(2000);
        navigate.forward();  
        Thread.sleep(2000);
        navigate.refresh();   

	}

}
