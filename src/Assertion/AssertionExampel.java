package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionExampel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String ExpectedResult = "Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More"; //if there is any mistake like any word missing,uppercase or lowercase then
																									//it will not match with actual result 
																									//if you want confirmation make some mistake and run the code
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	
	driver.findElement(By.partialLinkText("Women")).click();
	//System.out.println(driver.getTitle()); //get the title and copy and paste in Extepected result to match with actual result and then comment it
	
	Assert.assertEquals(ExpectedResult, driver.getTitle(),"expected result is not matching the actual result"); //if it is matching then we will not get error
																												//if it is not matching we will get error msg displayed in console

	}

}
