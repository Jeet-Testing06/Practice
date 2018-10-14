package practice_qs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit {
	
	@Test
	public void abc() {
		System.out.println("ABC Method");	
	}
	
	@Test
	public void def() {
		System.out.println("DEF Method");
	}
	
	@Before
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@After
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
	@org.junit.BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");
	}
	
	@org.junit.AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}
	
}