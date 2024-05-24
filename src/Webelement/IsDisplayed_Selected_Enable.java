package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Selected_Enable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//div[text()='Log in']"));
		System.out.println(button.isDisplayed());
		System.out.println(button.isSelected());
		System.out.println(button.isEnabled());
		

	}

}
