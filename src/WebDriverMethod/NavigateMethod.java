package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Navigation nav = driver.navigate();
		nav.to("https://www.swiggy.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		nav.refresh();
		nav.to("https://www.w3schools.com/");
		System.out.println(driver.getCurrentUrl()); // to check the current url
	}

}
