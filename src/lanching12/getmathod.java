package lanching12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/login.php/");
       String title = driver.getTitle();
       System.out.println(title);
       String url = driver.getCurrentUrl();
       System.out.println(url);
       String page = driver.getPageSource();
      System.out.println(page);
      String ID = driver.getWindowHandle();
      System.out.println(ID);
      

	}
	
	

}
