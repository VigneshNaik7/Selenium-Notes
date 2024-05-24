package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("vigneshnaik47.hi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log in']")).submit();

	}

}
