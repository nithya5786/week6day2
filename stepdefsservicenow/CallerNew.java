package stepdefsservicenow;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CallerNew extends BaseSetup{

	@And("Click New Caller")
	public void createNewCaller()
	{
		driver.findElement(By.xpath("//button[text()='New']")).click();
	}
	@And("Type firstname as (.*)$")
	public void typefirstName(String firstName)
	{
		driver.findElement(By.id("sys_user.first_name")).sendKeys(firstName);
	}
	
	@And("Type lastname as (.*)$")
	public void typeLastName(String lastName)
	{
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lastName);
	}
	@And("Click on Submit")
	public void clickSubmit()
	{
		driver.findElement(By.id("sysverb_insert")).click();
	}
	@Then("Print caller is created")
	public void printCaller()
	{
		System.out.println("Caller Created");
	}
	

}
