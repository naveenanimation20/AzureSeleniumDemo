package WM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectMethodConcept {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/login");
		//driver.manage().window().fullscreen();

//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//
//		// selenium 3:
//		Dimension loginButtonDim = loginButton.getSize();
//		System.out.println(loginButtonDim.getHeight());
//		System.out.println(loginButtonDim.getWidth());
//		
//		Point p = loginButton.getLocation();
//		System.out.println(p.getX());
//		System.out.println(p.getY());
//		
//		//selenium 4:
//		Rectangle loginButtonRect = loginButton.getRect();
//		
//		System.out.println(loginButtonRect.getHeight());
//		System.out.println(loginButtonRect.getWidth());
//
//		System.out.println(loginButtonRect.getX());
//		System.out.println(loginButtonRect.getY());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.google.com");

		

	}

}
