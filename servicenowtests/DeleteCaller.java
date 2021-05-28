package servicenowtests;

import org.testng.annotations.Test;

import servicenowhooks.TestNgHooksServiceNow;
import servicenowpages.ServiceLoginPage;

public class DeleteCaller extends TestNgHooksServiceNow {
	
	@Test
	public void deleteCaller() throws InterruptedException
	{
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorCaller()
		.searchByName("Preethi").clickOnName().deleteCaller();
	}

}
