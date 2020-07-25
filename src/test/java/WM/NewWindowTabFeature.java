package WM;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTabFeature {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		// driver.switchTo().newWindow(WindowType.TAB);// open a new blank tab

		driver.switchTo().newWindow(WindowType.WINDOW);// open a new blank
														// window

		Set<String> handles = driver.getWindowHandles();

		List<String> ls = new ArrayList<String>(handles);

		String parentWindowId = ls.get(0);
		String ChildWindowId = ls.get(1);

		System.out.println(parentWindowId);
		System.out.println(ChildWindowId);

		System.out.println("after switching title is: " + driver.getTitle());

		driver.get("http://www.facebook.com");
		System.out.println("after switching title is: " + driver.getTitle());

		driver.close();// close the tab

		driver.switchTo().window(parentWindowId);

		System.out.println("parent window title is: " + driver.getTitle());

	}

}
