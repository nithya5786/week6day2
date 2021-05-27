package stepdefsservicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateNewIncident extends BaseSetup 
{
	public static String number;
	public static String num2;
	@And("Click New Incident")
	public void clickNewIncident() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("sysverb_new")).click();
		
	}
	@And("Get Incident Number")
	public void getIncident()
	{	
		number = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(number);

	}
	@And("Type Short Description as {string}")
	public void ShortDesc(String shortdesc)
	{
		driver.findElement(By.id("incident.short_description")).sendKeys(shortdesc);
	}
    @And("Click on Submit button")
    public void clickSubmit()
    {
    	driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
    }
    @Then("Verify Incident Created")
    public void verifyIncident()
    {
    	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number, Keys.ENTER);
    
    num2 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
	if (number.equals(num2)) {
		System.out.println("Incident  created successfully");

	} else {
		System.out.println("Incident request not created");

	}
    }
}


