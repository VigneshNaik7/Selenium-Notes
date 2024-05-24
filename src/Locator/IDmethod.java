package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("vignesh@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).submit();
		//Thread.sleep(4000);
	//	driver.quit();

	}

}
