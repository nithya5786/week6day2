package servicenowtests;

import org.testng.annotations.Test;

import servicenowhooks.TestNgHooksServiceNow;
import servicenowpages.ServiceLoginPage;

public class CreateIncident extends TestNgHooksServiceNow 

{
	@Test
	public void createIncidentTest() throws InterruptedException {
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton()
		.filterNavigatorIncident().clickNewButton().getIncNumber().giveShortDesc()
		.clickOnSubmitButton().verifyCreatedIncident();

}
}

