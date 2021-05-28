package servicenowpages;

import org.openqa.selenium.By;

import servicenowhooks.TestNgHooksServiceNow;

public class UserNewRecord extends TestNgHooksServiceNow {
	
	public UserNewRecord assignFirstName(String firstName)
	{
		driver.findElement(By.id("sys_user.first_name")).sendKeys(firstName);
		return this;
	}
	public UserNewRecord  getfstName()
	{
		fstName = driver.findElement(By.id("sys_user.first_name")).getAttribute("value");
		System.out.println(number);
         return this;
	}
	
	
	public UserNewRecord assignLastName(String lastName) {
		driver.findElement(By.id("sys_user.last_name")).sendKeys(lastName);
		return this;
	}
    public UserService clickSubmit()
    {
    	driver.findElement(By.id("sysverb_insert")).click();
    	return new UserService();
    }
  public UserNewRecord deleteCaller()
  {
	  driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
		System.out.println("Caller is Deleted");
       return this;
  }
  
}
