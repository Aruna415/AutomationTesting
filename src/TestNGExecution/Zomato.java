package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zomato {
		@Test(groups="system")
		public void ZomatoLaunch() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zomato.com/india");
			Reporter.log("Zomato page",true);
			driver.quit();
}
}