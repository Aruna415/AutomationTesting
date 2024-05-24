package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicsofTestNG {

	public static void main(String[] args) {}
		@Test
		public void Amazon() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Reporter.log("Amazon",true);
			driver.quit();
		}
		@Test
		public void Flipcart() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.Flipcart.in/");
			Reporter.log("Flipcart",true);
			driver.quit();}
		@Test
		public void Ajio() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.Ajio.in/");
            Reporter.log("Ajio",true);
			driver.quit();}
		@Test
		public void Myntra() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.Myntra.in/");
			Reporter.log("Myntra",true);
			driver.quit();
		
	
}
}