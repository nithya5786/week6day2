package servicenowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import servicenowhooks.TestNgHooksServiceNow;

public class IncidentServicePage extends TestNgHooksServiceNow {
	
	
	public IncidentNewRecord clickNewButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("sysverb_new")).click();
		
		return new IncidentNewRecord();
	}
	public IncidentServicePage searchById(String changeID) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement searchIncident = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchIncident.click();
		searchIncident.sendKeys(changeID);
		searchIncident.sendKeys(Keys.ENTER);
        return this;
	}
	public IncidentNewRecord clickOnIncident()
	{
		WebElement number = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    System.out.println("Incident Number: " + number.getText());
		System.out.println(" ");
		number.click();
		return new IncidentNewRecord();
	}
	public IncidentServicePage verifyDeleteIncident()
	{
		String expectedText = "No records to display";
		String verifyIncident = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		System.out.println(verifyIncident);

		if (verifyIncident.equalsIgnoreCase(expectedText)) {
			System.out.println("Incident: " + number + " has been deleted");
			System.out.println(" ");
			System.out.println("Deleted Existing Incident ");
			driver.close();

		} else {
			System.out.println(number + " hasn't been deleted");
			System.out.println(" ");
			
		}
return this;
	}
	
	public IncidentServicePage verifyCreatedIncident() throws InterruptedException
	{
		
		WebElement searchIncident = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchIncident.click();
		searchIncident.sendKeys(number);
		searchIncident.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number, Keys.ENTER);
		String num2 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if (number.equals(num2)) {
			System.out.println("Incident  created successfully");

		} else {
			System.out.println("Incident request not created");

		}
return this;
	}

}
