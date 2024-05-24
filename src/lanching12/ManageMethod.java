package lanching12;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://skillacademy.com/");
		Dimension beforeMAximizing = driver.manage().window().getSize();
		System.out.println("beforeMAximizing");
		driver.manage().window().maximize();
		Dimension afterMAximizing = driver.manage().window().getSize();
		System.out.println("afterMAximizing");
		driver.manage().window().setSize(new Dimension(400, 900));
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		driver.manage().window().setPosition(new Point(50,60));
		}

	}


