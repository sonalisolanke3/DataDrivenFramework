package testCases;

import org.apache.commons.codec.binary.Base32;
import org.testng.annotations.Test;

import baseTest.BaseTest;



public class BankManagerLoginTest extends BaseTest{
	//Bankmanagerlogin
	@Test
	public void loginAsBankManager() {
		
		click("bmlBtn_XPATH");
		isElementPresent("addCustomerBtn_XPATH");
		
	}

}
