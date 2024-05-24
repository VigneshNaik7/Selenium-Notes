package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Ex: Mom ask us to go to corner shop ask to bring some items she will give the basket along with the address 
		//Location path of the file
		File f = new File(".\\TestData\\Testdata.properties");
		FileInputStream fis = new FileInputStream(f);
		
		
		//Go to perticulre shop and  take the items and put it in the basket. That's what creating the object
		//Create a object for property file
		Properties pro = new Properties();
	
		pro.load(fis);
		
		//After bring the item from the shop mom have to use it she will take  the item from the basket 
		//Using the data from the property file
		String url = pro.getProperty("URL");
		
		
		//Common steps
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		
				

	}

}
