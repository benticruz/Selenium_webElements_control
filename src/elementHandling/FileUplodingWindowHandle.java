package elementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodingWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\JAVA\\SeleniumWebElementsHandling\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'fileupload']")).sendKeys("D:\\Selenium\\JAVA\\SeleniumWebElementsHandling\\LocalFiles\\extent.html");

	}

}
