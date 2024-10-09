package day24;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingCase {
	
	
	
	@Test(groups="Smoke")
	void test() {
	System.out.println("Smoke group");
	}
	
	@Test(groups="Regression")
	void test1() {
	System.out.println("Regression group");
	
	}

	@Test(groups="Smoke")
	void test2() {
	System.out.println("Smoke group");
	}
	
	@Test(groups="Regression")
	void test3() {
		System.out.println("Regression group");
		}
	
	@Test(groups="Regression")
	void test4() {
		System.out.println("Regression group");
		}
	
	/*@AfterTest
	void Screenshot() {
	*/
	}


