package PracticeProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properti_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File(".\\TestData\\exampel.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String url = p.getProperty("URL");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

}
