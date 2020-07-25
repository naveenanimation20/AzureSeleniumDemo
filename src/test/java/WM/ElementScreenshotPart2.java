package WM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshotPart2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.get("https://app.hubspot.com/login");
//
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		WebElement forgotPwd = driver.findElement(By.linkText("Forgot my password"));
//
//		email.sendKeys("naveen@gmail.com");
//		password.sendKeys("Test@123");
//
//		takeElementScreenshot(email, "email1");
//		takeElementScreenshot(password, "password1");
//		takeElementScreenshot(loginButton, "loginButton1");
//		takeElementScreenshot(forgotPwd, "forgotPwd1");
		
		driver.get("http://www.google.com/");
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement text = driver.findElement(By.name("q"));
        
        Actions make  = new Actions(driver);
        
        Action kbEvents = make.keyDown(text, Keys.SHIFT).sendKeys("Java Code Geeks")
       .keyUp(text, Keys.SHIFT).doubleClick().contextClick().build();
       kbEvents.perform();

	}

	public static void takeElementScreenshot(WebElement element, String fileName) {
		TakesScreenshot scrShot = ((TakesScreenshot) element);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
