package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skillery.in/");
		Dimension beforemax = driver.manage().window().getSize();
		System.out.println(beforemax);
		driver.manage().window().maximize();
		Dimension aftermax = driver.manage().window().getSize();
		System.out.println(aftermax);
		driver.manage().window().setSize(new Dimension(700,400));
		Point beforepos = driver.manage().window().getPosition();
		System.out.println(beforepos);
		driver.manage().window().setPosition(new Point(50,30));
		driver.manage().window().setSize(new Dimension(600,600));
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
	}

}
