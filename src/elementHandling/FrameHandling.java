package elementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\JAVA\\SeleniumWebElementsHandling\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("abella");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("bellabenti");

		Thread.sleep(3000);

		driver.findElement(By.xpath(".//input[@class='btn btn-small']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath(".//a[@title='Contacts']")).click();



	}





}
