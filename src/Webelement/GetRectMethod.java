package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		Rectangle emailtextbox = email.getRect();
		Thread.sleep(2000);
		Rectangle passtextbox = pass.getRect();
		System.out.println(emailtextbox.y);
		System.out.println(passtextbox.y);
		System.out.println(emailtextbox.getY());
		System.out.println(passtextbox.getY());
		Thread.sleep(2000);
		if(emailtextbox.getWidth()==passtextbox.getWidth()) {
			System.out.println("Width are equal");
		}
		else {
			System.out.println("Width are not equal");
		}

	}

}
