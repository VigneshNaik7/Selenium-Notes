package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentAndIndependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/search");
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("apple");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Apple Chilli']/../../../..//button[text()='ADD']")).click();
		
		//driver.findElement(By.xpath("(//p[text()='Apple - Washington'])[1]/../../..//button[text()='ADD']")).click();
		Thread.sleep(7000);
		//driver.quit();
	}

}
