package servicenowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import servicenowhooks.TestNgHooksServiceNow;

public class ServiceHomePage extends TestNgHooksServiceNow {
	public IncidentServicePage filterNavigatorIncident() {
		WebElement filterNav = driver.findElement(By.id("filter"));
		filterNav.sendKeys("Incident");
		filterNav.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		driver.switchTo().frame(0);
		return new IncidentServicePage();
	}
	
	public UserService filterNavigatorCaller() {
		WebElement filterNav = driver.findElement(By.id("filter"));
		filterNav.sendKeys("Caller");
		filterNav.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame(0);
		return new UserService();
	
 
}
	public ProposalService filterNavigatorProposal()
	{
		WebElement filterNav = driver.findElement(By.id("filter"));
		filterNav.sendKeys("proposal");
		filterNav.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		driver.switchTo().frame(0);
		return new ProposalService();
	
		
	}
}
