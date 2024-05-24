package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshot.WebElement;



public class WebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		File tem = driver.findElement(By.xpath("//img[@alt=\"Udemy\" and loading=\"lazy\"]")).getScreenshotAs(OutputType.FILE);
		File per=new File("./Errorshots/image2.jpeg");
		FileHandler.copy(tem, per);
	}

}
