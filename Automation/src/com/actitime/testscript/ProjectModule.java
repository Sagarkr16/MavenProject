package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	@Test
public void createProject() {
	Reporter.log("createProject",true);
}
	@Test
public void deleteProject() {
	Reporter.log("deleteProject",true);
}
	@Test
public void modifyProject() {
	Reporter.log("modifyProject",true);
}
}
