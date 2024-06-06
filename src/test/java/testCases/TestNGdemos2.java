package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGdemos2 extends Setup {
	@Test(groups="Smoke")
	public void test() {
		System.out.println("Testcase4 Smoke");
	}
	@Test(groups="Regression")
	public void test1() {
		System.out.println("Testcase5 Regression");
	}
	@Test(groups="Regression")
	public void abc() {
		System.out.println("Testcase6 Regression");
	}

}
