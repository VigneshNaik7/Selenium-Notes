package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSpopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Alert Popup
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.switchTo().frame("login_page");
//		driver.findElement(By.linkText("CONTINUE")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		
		//Confirmation PopUp
//		driver.get("https://licindia.in/");
//		driver.findElement(By.partialLinkText("Login")).click();
//		Alert alert = driver.switchTo().alert();   //There is no frame so we are not using switchTo().frame method
//		//alert.accept();
//		Thread.sleep(2000);
//		alert.dismiss();
		
		
		//Prompt Popup
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("vignesh");
		alert.accept();
		

	}

}
