package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zepto {
		@Test(groups="smoke")
		public void ZeptoLaunch() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zeptonow.com/");
			Reporter.log("Zepto page",true);
			driver.quit();
}
}