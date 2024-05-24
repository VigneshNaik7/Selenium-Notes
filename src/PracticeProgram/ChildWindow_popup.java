package PracticeProgram;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile 5g",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='realme P1 5G (Phoenix Red, 128 GB)']")).click();
		
		String source = driver.getWindowHandle();
		Set<String> destination = driver.getWindowHandles();
		
		destination.remove(source);
		
		for(String control:destination) {
			driver.switchTo().window(control);
			driver.findElement(By.linkText("256 GB")).click();
		}
		
		

	}

}
