package TestNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FoodPanda {
	
	@Test(groups="System Testing")
	public void FoodPandaLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foodpanda.com/");
		Reporter.log("FoodPanda page",true);
		driver.quit();

}
}
//https://www.foodpanda.com/