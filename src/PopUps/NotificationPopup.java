package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using the chromeoptions we can disable the notification
		//once we open the application notifiaction will be pop up in the web page to avoid that we use Chromeoptions
		
		ChromeOptions setting = new ChromeOptions();
		
		//setting.addArguments("---disable-notification"); //1st approach
		
		setting.addArguments("--incognito"); 				//2nd approach
		
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");

	}

}
