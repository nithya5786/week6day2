package servicenowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import servicenowhooks.TestNgHooksServiceNow;

public class ProposalService extends TestNgHooksServiceNow {
	
	public ProposalNewRecord clickNewButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		return new ProposalNewRecord();
	}
	
	public ProposalService verifyProposal()
	{
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(proposal,Keys.ENTER);
		if(driver.findElement(By.xpath("//a[@class='linked formlink']")).isDisplayed()) {
			System.out.println("New Proposal is created");

	}
  return this;
}
}

