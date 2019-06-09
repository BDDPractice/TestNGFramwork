package Framework.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	//Order of type 
	
	
	@BeforeSuite
	public void testsuite() {
		System.out.println("1. BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("2. BeforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("3. BeforeClass");
	}
	@BeforeMethod
	public void beforeMehtod() {
		System.out.println("4. BeforeMethod");
	}
	
	//*******************************************
	@Test
	public void testCase() {
		System.out.println("5. Test");
	//*******************************************
		
	}
	@AfterMethod
	public void afterMehtod() {
		System.out.println("4. afterMehtod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("3. afterClass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("2. afterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("1. afterSuite");
	}
		
	}
