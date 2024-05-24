package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		email.sendKeys("Vignesh");
		email.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		password.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		login.sendKeys(Keys.ENTER);
		

	}

}
