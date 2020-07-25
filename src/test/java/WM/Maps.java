package WM;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.facebook.com");
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		
		List<String> ls = new ArrayList<String>(handles);
		String parentWindowId = ls.get(0);
		System.out.println(parentWindowId);
		String childWindowId = ls.get(1);
		System.out.println(childWindowId);
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());


	}

}
