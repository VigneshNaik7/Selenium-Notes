package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		//1st approach
		WebElement abc = driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[2]"));
		Actions a = new Actions(driver);
		//a.contextClick(abc).perform();
		
		//2st approach(0,0)x and y axis
		//a.contextClick().perform();
		
		//3st approach(0,0)x and y axis
		a.contextClick().perform();
		

	}

}
