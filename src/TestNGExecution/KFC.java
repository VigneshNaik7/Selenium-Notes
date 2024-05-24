package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KFC {
	@Test(groups="Somke Testing")
	public void KFCLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		Reporter.log("KFC page",true);
		driver.quit();
	}

}
