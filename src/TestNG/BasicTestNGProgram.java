package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicTestNGProgram {
	
	@Test(priority=1,enabled = false) //Gives the priority to which to execute 1st if we didn't give the priorty method
	public void W3School() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Reporter.log("W3School",true);
		driver.quit();
	}
	
	
	@Test(priority=4)
	public void Amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon",true);
		driver.quit();
	}
	
	@Test(priority=2,dependsOnMethods ="Amazon" ) //dependsOnMethods:-this method is used because evan though priority less than amazon(Acually youetube 
													// should execute 1st)but it still execute amason 1st and then youtube beacuse of dependsOnMethods
															
	public void YouTube() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Reporter.log("YouTube",true);
		driver.quit();
	}
	
	@Test(priority=3,invocationCount = 3,threadPoolSize = 3) //invocationCount:- mutipal time we can run the testcase by giving invocationCount 
															//threadPoolSize:-multipal tab will open parallay 
	public void FlipCart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("FlipCart",true);
		driver.quit();
	}
	
	
	

}
