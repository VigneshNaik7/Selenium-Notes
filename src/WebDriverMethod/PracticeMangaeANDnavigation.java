package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMangaeANDnavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Navigation nav = driver.navigate();
		nav.to("https://www.javatpoint.com/"); //java
		driver.manage().window().maximize(); //max
		Thread.sleep(2000);
		nav.to("https://www.w3schools.com/"); //w3s
		Thread.sleep(2000);
		//nav.forward();
		Thread.sleep(2000);
		nav.to("https://www.geeksforgeeks.org/"); //greeks
		Thread.sleep(2000);
		nav.back();									//w3s
		Thread.sleep(2000);
		nav.back();									//java
		Thread.sleep(2000);
		nav.forward();								//w3s
		Thread.sleep(2000);
		nav.forward();	
		nav.refresh();//greeks

	}

}
