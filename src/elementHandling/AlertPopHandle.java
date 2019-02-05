package elementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertPopHandle {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\JAVA\\SeleniumWebElementsHandling\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name = 'proceed']")).click();
		Alert alert = driver.switchTo().alert();
		
		String alertMesg = alert.getText();
		
		System.out.println(alertMesg);
		
		Assert.assertEquals(alertMesg, "Please enter a valid user name");//<--------------validation part
		
		alert.accept(); //click ok btn
		
		//alert.dismiss(); <--------------------------if click cancel btn
		
		driver.quit(); //<---------------------------all driver quit

	}

}
