package servicenowpages;

import org.openqa.selenium.By;

import servicenowhooks.TestNgHooksServiceNow;

public class IncidentNewRecord extends TestNgHooksServiceNow {
	
	
	public IncidentNewRecord  getIncNumber()
	{
		number = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(number);
         return this;
	}
	public IncidentNewRecord  giveShortDesc()
	{
		driver.findElement(By.id("incident.short_description")).sendKeys("Test3");
		return this;
	}
	public IncidentServicePage clickOnSubmitButton()
	{
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		return new IncidentServicePage();
	}
	
	public IncidentServicePage deleteIncident()
	{
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
        return new IncidentServicePage();
	}
	

}
