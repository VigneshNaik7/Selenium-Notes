package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenrateStaleElementRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		String before = driver.getWindowHandle();
		System.out.println(before);
		driver.navigate().refresh();
		
		String after = driver.getWindowHandle();
		System.out.println(after);
		ele.sendKeys("Shoes");
	}

}
