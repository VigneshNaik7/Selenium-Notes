package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zomato {
	
		@Test(groups="Inegration Testing")
		public void ZomatoLaunch() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.zomato.com/");
			Reporter.log("Zomato page",true);
			driver.quit();
		}

}
