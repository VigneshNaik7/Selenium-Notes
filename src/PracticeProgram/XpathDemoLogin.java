package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement errormsg1 = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]"));
		System.out.println(errormsg1.getText());
		

	}

}
