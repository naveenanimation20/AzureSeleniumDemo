package WM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysCharSequence {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.id("username"));
		
		//1. String:
		//email.sendKeys("Naveen@gmail.com");
		
		//2. StringBuilder:
		
//		StringBuilder username = new StringBuilder()
//				.append("Naveen")
//				.append(" ")
//				.append("automation")
//				.append(" ")
//				.append("Labs")
//				.append(" ")
//				.append("Selenium");
		
		
		//3. StringBuffer:
//		StringBuffer username = new StringBuffer()
//				.append("Naveen")
//				.append(" ")
//				.append("automation")
//				.append(" ")
//				.append("Labs")
//				.append(" ")
//				.append("Selenium");
		
		
		//4. StringBuilder, StringBuffer, String, Keys
		StringBuilder username = new StringBuilder()
		.append("Naveen")
		.append(" ")
		.append("automation")
		.append(" ")
		.append("Labs")
		.append(" ")
		.append("Selenium");
		
		String space = " "; 
		
		StringBuffer userInfo = new StringBuffer()
				.append("Test")
				.append(" ")
				.append("WebDriver");
		
		String author = "Naveen Khunteta";
		
		
		email.sendKeys(username, space, userInfo, space, author, Keys.TAB );
		
		
	}

}
