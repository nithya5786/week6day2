package servicenowtests;

import org.testng.annotations.Test;

import servicenowhooks.TestNgHooksServiceNow;
import servicenowpages.ServiceLoginPage;

public class DeleteIncident extends TestNgHooksServiceNow {
	
	@Test
	public void delteIncident()throws InterruptedException 
	{
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorIncident().searchById("INC0011673")
		.clickOnIncident().deleteIncident().verifyDeleteIncident();
	}

}
