package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider = "cred")
	
	public void tologin(String username,String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		WebElement username1 = driver.findElement(By.name("username"));
		WebElement password1 = driver.findElement(By.name("password"));
		
		username1.sendKeys(username);
		password1.sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.quit();
	}
	
	@DataProvider(name="cred")
	public String[][] senddata(){
		
		String[] [] data= {
				{"vignesh@gmail.com","naik123"},
				{"sairam@gmail.com","sai123"},
				{"nuthan@gmail.com","nuthan123"},
				{"vidya@gmail.com","vidya123"}
		};
		
		return data;
		
	}
	
}
