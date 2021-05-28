package servicenowtests;

import org.testng.annotations.Test;

import servicenowhooks.TestNgHooksServiceNow;
import servicenowpages.ServiceLoginPage;

public class CallerNew extends TestNgHooksServiceNow {
	@Test
	public void callerNew() throws InterruptedException {
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorCaller()
		.clickNew().assignFirstName("Preethi").getfstName().assignLastName("gopalan").clickSubmit()
		.verifyCallerCreated("preethi");
	}

}
