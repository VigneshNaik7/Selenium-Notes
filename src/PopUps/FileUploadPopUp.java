package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		//driver.findElement(By.id("resumeUpload")).sendKeys("‪C:\\Users\\Vignesh Naik\\Downloads\\AA.pdf");
		//driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Vignesh Naik\\Downloads\\AA.pdf");
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Vignesh Naik\\Downloads\\null.pdf");
		//right click on the file go to properties go security copy the path
		
		
	}

}


// we should go for input tag instade of other tag like div button etc because if we click on that button 
//it will go for system location pop up that  is not allowed in selenium for that purpose we pass the the 
// file location in the system in sendkeys