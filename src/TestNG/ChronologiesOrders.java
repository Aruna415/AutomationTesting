package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologiesOrders {


 @BeforeSuite
		public void beforesuite() {
	 Reporter.log("BeforeSuite is getting launched",true);
}
 
 @AfterSuite
	public void aftersuite() {
Reporter.log("AfterSuite is getting launched",true);
}
 
 @BeforeClass
	public void beforeclass() {
Reporter.log("BeforeClass is getting launched",true);
}
 
 @AfterClass
	public void afterclass() {
Reporter.log("AfterClass is getting launched",true);
}
 
 @BeforeTest
	public void beforetest() {
Reporter.log("BeforeTest is getting launched",true);
}
 
 @AfterTest
	public void aftertest() {
Reporter.log("AfterTest is getting launched",true);
}
 
 @BeforeMethod
	public void beforemethod() {
Reporter.log("BeforeMethod is getting launched",true);
}
 
 @AfterMethod
	public void Aftermethod() {
Reporter.log("AfterMethod is getting launched",true);
}
 @Test
 public void MainMethod() {
	 Reporter.log("main method",true);
	 
 }
	}



