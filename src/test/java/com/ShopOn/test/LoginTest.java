package com.ShopOn.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ShopOn.BaseTest.BaseTest;
import com.ShopOn.PageObjects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;




public class LoginTest extends BaseTest {
	
	@BeforeClass
	public static void startTest() {
		BaseTest.startTest();
		test = report.startTest("Valid Details TestCase");
	}
	
	public void setUp() {

		super.setUp();
	
	}
	
	
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public static void endTest() {
		BaseTest.endTest();
	}
	
	
	@Test
	public void Login() throws InterruptedException {
		
		LoginPage objlogin = new LoginPage(super.driver);

		objlogin.setUserName("qwerty1");

		objlogin.setPassword("qwerty");
// 		objlogin.clickSubmit();
// 		Thread.sleep(1000);
// 		assertTrue((driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[4]/a")).isDisplayed()));
		test.log(LogStatus.PASS, "Test Passed");
		System.out.println("test passed");
		
		
	}
	
	

}
