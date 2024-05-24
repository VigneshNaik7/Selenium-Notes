package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("vigneshnaik678@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("naik1999");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("(//div[text()='automation'])[1]")).click();
		WebElement source = driver.findElement(By.linkText("abc"));
		WebElement destination = driver.findElement(By.xpath("//h2[text()='Click']/../../..//button[text()='Add a card']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, destination).perform();
		

	}

}
