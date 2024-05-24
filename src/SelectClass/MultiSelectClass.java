package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(01));
		driver.get("https://demoapp.skillrary.com/");
		WebElement cars = driver.findElement(By.id("cars"));
		Select s = new Select(cars);
		s.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
		s.selectByValue("90");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		Thread.sleep(2000);
		s.deselectByValue("90");
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.isMultiple());

	}

}
