package stepdefsservicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DeleteIncident extends BaseSetup {
	public static WebElement searchIncident;
	public static WebElement number;
	public static String expectedText;
	public static String verifyIncident;
	@And("Search incident number as (.*)$")
	public void searchIncident(String inciNumber) throws InterruptedException
	{
		Thread.sleep(2000);
		searchIncident = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchIncident.click();
		searchIncident.sendKeys(inciNumber);
		searchIncident.sendKeys(Keys.ENTER);

	}
	@And("Click on the incident number")
	public void clickOnInci() throws InterruptedException
	{
       Thread.sleep(2000);
		
		number = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    System.out.println("Incident Number: " + number.getText());
		System.out.println(" ");
		number.click();
		
	}
   @And("Click on Delete incident")
   public void clickOnDel()
   {
	   driver.findElement(By.id("sysverb_delete")).click();
	   driver.findElement(By.id("ok_button")).click();

   }
   @Then("Verify the deleted incident")
   public void verifyDel()
   {
	   expectedText = "No records to display";
	   verifyIncident = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
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

   }
}
