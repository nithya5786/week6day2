package stepdefsservicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateNewProposal extends BaseSetup
{
	public static String proposal;
	@And("Click New proposal")
	public void clickNewProposal()
	{
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
	}
	@And("Get Proposal Value")
	public void getProposal()
	{
		proposal=driver.findElement(By.id("std_change_proposal.number")).getAttribute("value");
	}
	@And("Short description as {string}")
	public void shortDescrip(String shortdes)
	{
		driver.findElement(By.id("std_change_proposal.short_description")).sendKeys(shortdes);
	}
	@And("Click Change Request value")
	public void clickChangeRequestVal()
	{
		driver.findElement(By.xpath("//span[text()='Change Request values']")).click();
	}
	@And("Clear and enter short description as {string}")
	public void clearAndEntersd(String changesd)
	{
		driver.findElement(By.xpath("//td[@data-value='Short description']//input[1]")).clear();
		driver.findElement(By.xpath("//td[@data-value='Short description']//input[1]")).sendKeys(changesd);
		
	}
	@And("Click on submit for proposal")
	public void clickonSub()
	{
		driver.findElement(By.id("sysverb_insert")).click();
	}
	@Then("verify proposal created")
	public void verifyProposal()
	{
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(proposal,Keys.ENTER);
		if(driver.findElement(By.xpath("//a[@class='linked formlink']")).isDisplayed()) {
			System.out.println("New Proposal is created");

	}
	
	
}
}