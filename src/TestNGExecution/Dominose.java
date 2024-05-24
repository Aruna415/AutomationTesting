package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dominose {
		@Test(groups="smoke")
		public void DominoseLaunch() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://pizzaonline.dominos.co.in/");
			Reporter.log("Dominose page",true);
			driver.quit();
}
}