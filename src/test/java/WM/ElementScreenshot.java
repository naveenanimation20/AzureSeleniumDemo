package WM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/signup-v2/crm/step/user-info");
		
		WebElement user = driver.findElement(By.xpath("//form"));
		File srcFile = user.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("./target/register_hub.png"));
		driver.quit();
		
		
	}

}
