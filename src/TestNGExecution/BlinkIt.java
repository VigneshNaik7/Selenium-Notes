package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BlinkIt {
	
	@Test(groups="System Testing")
	public void BlinkItLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blinkit.com/");
		Reporter.log("BlinkIt page",true);
		driver.quit();
	}


}
