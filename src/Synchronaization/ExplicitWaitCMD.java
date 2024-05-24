package Synchronaization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCMD {

	private static final String ExpectedCondtions = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/8");
	//	driver.findElement(By.id("Check Delivery")).sendKeys("576214");
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement delivery = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Check Delivery")));
		delivery.sendKeys("576214");
		
		WebElement checkfun = mywait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
	
		//driver.findElement(By.id("Check")).click();
		checkfun.click();

	}

}

//1.Conditional based, it will work more effectively.
//2.Finding element is inclusive( for some conditions).
//3.It will wait for condition to be true then consider the time.
//4.We need to write multiple statement for multiple elements.
