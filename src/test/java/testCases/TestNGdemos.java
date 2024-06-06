package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGdemos extends Setup{
	@Test(groups="Regression")

	public void test1() {
		System.out.println("Testcase1 Regression");
	}
	@Ignore
	@Test(groups="Smoke")
	public void test() {
		System.out.println("Testcase2 Smoke");
	}
	@Test()
	public void abc() {
		System.out.println("Testcase3 Smoke");

}
}
