package WM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/login");
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		Rectangle loginBtnRect = loginBtn.getRect();
		
		System.out.println(loginBtnRect.getHeight());
		System.out.println(loginBtnRect.getWidth());
		System.out.println(loginBtnRect.getX());
		System.out.println(loginBtnRect.getY());

		
		
	}

}
