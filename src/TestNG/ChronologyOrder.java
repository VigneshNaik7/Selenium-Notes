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

public class ChronologyOrder {
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Beforesuite is getting lanuched",true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("Aftersuite is getting lanuched",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("Beforetest is getting lanuched",true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("Aftertest is getting lanuched",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Beforeclass is getting lanuched",true);
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("afterclass is getting lanuched",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Beforemethod is getting lanuched",true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("aftermethod is getting lanuched",true);
	}
	
	@Test
	public void mainmethod() {
		Reporter.log("Main method is getting launched",true);
	}

}
