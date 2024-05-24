package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssLocTagTextSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		WebElement attribute = driver.findElement(By.linkText("Try Free"));
		
		System.out.println(attribute);
		System.out.println("Tag name is : "+attribute.getTagName());
		System.out.println(attribute.getCssValue("color"));
		System.out.println(attribute.getText());
		System.out.println(attribute.getLocation());
		System.out.println(attribute.getSize());
		System.out.println(attribute.getCssValue("background-color"));

	}

}
