package stepdefsservicenow;

import io.cucumber.java.en.And;

public class ServiceNowFrame extends BaseSetup {
	/*@And("Switch to ParentFrame")
	public void switchToFrame0() {
		driver.switchTo().frame(0);

	}*/
 @And("Switch to NewFrame")
 public void switchToNewFrame()
 {
	 driver.switchTo().frame("gsft_main");
 }
}
