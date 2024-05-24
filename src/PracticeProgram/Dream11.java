package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		//driver.findElement(By.id("regEmail")).sendKeys("7899528806");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7899528806");
		

	}

}
