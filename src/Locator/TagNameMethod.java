package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> link = driver.findElements(By.tagName("a")); // a is nothing but link tag to find how many links in page
		System.out.println(link.size());
		
		List<WebElement> link1 = driver.findElements(By.tagName("img")); // img is nothing but find how many img in application page
		System.out.println(link1.size());
	}

}
