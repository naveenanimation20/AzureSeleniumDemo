package com.google.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{
//	WebDriver driver;
//	
//	private GooglePage(WebDriver driver){
//		this.driver = driver;
//	}
	
	public void testGoogleSearch() throws Exception {
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Testing");
		driver.findElement(By.name("q")).submit();
		//driver.findElement(By.name("btnK")).click();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele -> System.out.println(ele.getText()));
	}

	// tear down function to close browser
	public void tearDown() {
		driver.quit();
	}

}
