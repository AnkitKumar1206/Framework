package Framework.StepDefinations;

import org.testng.annotations.Test;

public class TestNGDependency {

	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(dependsOnGroups = "sanity1")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups = "sanity1")
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test4() {
		System.out.println("Test 4");
	}
}
