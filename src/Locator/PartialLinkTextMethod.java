package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("BOOKS")).click();

	}

}

//When we go for partial lintext
// any thing in the anchor tag <a></a> when it does  not match the text in the  web application then we go for 
//partial linktext and it is a case sensitive 
// for example 
// In web application link text showing in BOOKS
// But in source code link text showing in Books in this time we go for partial link text 
// we have to write driver.findElement(By.partialLinkText("BOOKS")).click(); which is showing in web  application only

