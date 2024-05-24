package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		deiver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		WebElement email= driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		Rectangle emailtextfield=email.getRect();	
		Rectangle passwordtextfield=password.getRect();	
		System.out.println(emailtextfield.getX());
		System.out.println(passwordtextfield.getX());{
			if(emailtextfield.getX()==passwordtextfield.getX());
			
		}


	}

}
