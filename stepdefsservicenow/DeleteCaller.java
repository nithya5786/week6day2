package stepdefsservicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DeleteCaller extends BaseSetup {
	
	@And("Search with name as (.*)$")
	public void searchName(String firstName)
	{
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(firstName,Keys.ENTER);
	}
    @And("Click on the Name")
    public void clickName()
    {
    	driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
    }
    @And("Click Delete")
    public void deleteClick()
    {
    	driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
		
    }
    @Then("Print deleted")
    public void printAsDeleted()
    {
    	System.out.println("Caller is Deleted");
    }
}
