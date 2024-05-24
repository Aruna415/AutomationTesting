package lanching12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	  
		driver.get("https://demowebshop.tricentis.com/books");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.manage().window().minimize();
	      Thread.sleep(2000);

	      driver.manage().window().fullscreen();
	}

}
