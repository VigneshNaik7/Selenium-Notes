package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']")).click();
		
		//once we click on the Apple iPhone 13 (128GB) - Midnight in the amezon it will switch to another page
		//thats what control is switched from parent page to child page
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles(); // more then one window its plural we use windowhandels
		
		child.remove(parent); // removing the control from parent page
		
		for(String control:child) {  //control is switched to child to control in for each loop
			driver.switchTo().window(control);
			driver.findElement(By.xpath("//span[text()='26,527 ratings']")).click();
		}

	}

}
