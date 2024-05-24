package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vignesh%20Naik/Documents/selectclass.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement menu = driver.findElement(By.id("Empire"));
		
		
		//Single select
		
		Select s = new Select(menu);
		//s.selectByIndex(0);
		//s.selectByValue("c");
		//s.selectByVisibleText("Chicken Roll");
		
		//Multi Select
		s.selectByIndex(0);
		s.selectByValue("c");
		s.selectByValue("d");
		s.deselectByValue("d");
		//System.out.println(s.getAllSelectedOptions());

	}

}
