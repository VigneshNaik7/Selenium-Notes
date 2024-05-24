package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Vignesh");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("naik");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("7899528806");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_day")).sendKeys("6");
		driver.findElement(By.name("birthday_month")).sendKeys("Jul");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		


		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'registering')]"));
		//WebElement msg = driver.findElement(By.id("reg_error_inner"));
		System.out.println(msg.getText());

	}

}
