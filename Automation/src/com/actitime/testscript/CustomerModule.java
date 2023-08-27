package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
//	@Test
//	public void createCustomerPractice() {
//		Assert.fail();
//		Reporter.log("createCustomer",true);
//	}
//	@Test
//	public void deleteCustomer() {
//		Reporter.log("deleteCustomer",true);
//	}
//	@Test(dependsOnMethods = "createCustomer")
//	public void modifyCustomer() {
//		Reporter.log("deleteCustomer",true);
//	}
	@Test
	public void createCustomer() {
	      HomePage h = new HomePage(driver);
	      
	      
	      
	}
	
}
