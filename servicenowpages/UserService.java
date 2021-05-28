package servicenowpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import servicenowhooks.TestNgHooksServiceNow;

public class UserService extends TestNgHooksServiceNow {
	
	public UserNewRecord clickNew() {
		driver.findElement(By.xpath("//button[text()='New']")).click();
		return new UserNewRecord();
	}
	
	public void verifyCallerCreated(String firstName) throws InterruptedException
	{
		WebElement searchfirstName = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchfirstName.click();
		searchfirstName.sendKeys(firstName);
		searchfirstName.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	
	String lstName2 = driver.findElement(By.xpath("(//td[@class='vt'])[2]")).getText();
	if (fstName.equals(lstName2)) {
		System.out.println("caller  created successfully");

	} else {
		System.out.println("caller request not created");

	}

	}
	public UserService searchByName(String frstName) throws InterruptedException
	{
		WebElement searchName = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchName.click();
		searchName.sendKeys(frstName);
		searchName.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
       return this;
       
	}
	
	public UserNewRecord clickOnName()
	{
		WebElement name= driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    System.out.println("name: " + name.getText());
		System.out.println(" ");
		name.click();
		return new UserNewRecord();
	}

}

