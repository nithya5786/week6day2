package servicenowhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgHooksServiceNow {
	public static ChromeDriver driver;
	public static String number;
	public static String fstName;
	public static String proposal;
	@BeforeMethod
	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev103117.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public static void switchToFrame0() {
		driver.switchTo().frame(0);
	}

}
