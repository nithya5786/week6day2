package stepdefsservicenow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowLoginSteps extends BaseSetup {

	@Given("Launch Chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@When("Load URL {string}")
	public void loadUrl(String url) {
		driver.get(url);
	}

	@And("Type username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("user_name")).sendKeys(username);
	}

	@And("Type password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}

	@And("Click Login Button")
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(1000);
	}

	@Then("Verify Login is successful")
	public void isSuccess() {
		String expectedHeaderText = driver.findElement(By.xpath("//span[text()='Service Management']")).getText();
		String serviceNowPage = driver.findElement(By.className("navbar-header")).getText();
		if (expectedHeaderText.contains(serviceNowPage)) {
			System.out.println("Logged in success of Service now Application");
		}

	}

	@When("Enter Value in FilterNavigator for caller as (.*)$")
	public void getValueFilterNav(String filterNav) throws InterruptedException {
		/*WebElement filterNavigator = driver.findElement(By.id("filter"));
		filterNavigator.sendKeys(filterNav);
		Thread.sleep(3000);
		//filterNavigator.sendKeys(Keys.ENTER);
		filterNavigator.click();*/
		driver.findElement(By.id("filter")).sendKeys(filterNav,Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		
	}
	@When("Enter Value in FilterNavigator for incident as (.*)$")
	public void getValueIncidentNav(String filterNav)
	{
		driver.findElement(By.id("filter")).sendKeys(filterNav,Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		
	}
	
	@When("Enter Value in FilterNavigator for proposal as (.*)$")
	public void getValueproposalNav(String filterNav)
	{
		driver.findElement(By.id("filter")).sendKeys(filterNav,Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		
	}
	
	
	}

