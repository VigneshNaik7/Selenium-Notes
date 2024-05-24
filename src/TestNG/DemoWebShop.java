package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop {
	
	@Test(dataProvider = "cred")
	public void toregister(String gender,String firstname1,String lastname1,String email1,String password1,String cpassword1) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		WebElement clickmale = driver.findElement(By.id("gender-male"));
		WebElement clickfemale = driver.findElement(By.id("gender-female"));
		
		
		
		if(gender.equals("male")) {
			clickmale.click();
		} else {
			clickfemale.click();
		}
		WebElement firstname = driver.findElement(By.id("FirstName"));
		WebElement lastname = driver.findElement(By.id("LastName"));
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement cpassword = driver.findElement(By.id("ConfirmPassword"));
		
		firstname.sendKeys(firstname1);
		lastname.sendKeys(lastname1);
		email.sendKeys(email1);
		password.sendKeys(password1);
		cpassword.sendKeys(cpassword1);
		
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}
	
	@DataProvider(name="cred")
	
	public String[][] setdata(){
		String gender="male";
		
		String[][] value = {
							{"male","vignesh","naik","vignesh@gmail.com","naik123","naik123"},
							{"male","sai","ram","sairam@gmail.com","sai123","sai123"},
							{"female","nuthan","bhat","nuthan@gmail.com","bhat123","bhat123"},
							{"male","tejas","poojari","tejas@gmail.com","tejas123","tejas123"},
							{"female","vidya","naik","vidya@gmail.com","naik321","naik321"}
		};
		
		return value;
		
	}
}
