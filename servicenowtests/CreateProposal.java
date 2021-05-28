package servicenowtests;

import org.testng.annotations.Test;

import servicenowhooks.TestNgHooksServiceNow;
import servicenowpages.ServiceLoginPage;

public class CreateProposal extends TestNgHooksServiceNow {
	
	@Test
	public void newProposal() throws InterruptedException
	{
		new ServiceLoginPage().typeUName().typePwd().clickLoginButton().filterNavigatorProposal().clickNewButton()
		.getProposal().assignshort("proposal").changeReqValue("This is New Proposal").clickSubmit()
		.verifyProposal();
	}

}
