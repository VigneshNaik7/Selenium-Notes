package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.cssSelector("img[alt=\"Wooden Dining Furniture\"]")).click();
		Thread.sleep(2000);
		boolean logo = driver.findElement(By.cssSelector("img[alt=\"Home Furniture Online\"]")).isDisplayed();
		System.out.println(logo);
		boolean logo2 = driver.findElement(By.cssSelector("img[alt=\"Wooden Sofa Come Bed Furniture\"]")).isDisplayed();
		System.out.println(logo2);
	}

}

//When to use css selector
//Check in the source code find the tag name(img) and select the attribute name [alt] in that attribute value "  "
// then Ctrl+F there write the syntax img[alt="Wooden Dining Furniture"] copied value from alt value