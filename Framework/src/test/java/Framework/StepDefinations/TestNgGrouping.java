package Framework.StepDefinations;

import org.testng.annotations.Test;

public class TestNgGrouping {

	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups = {"smoke"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void test4() {
		System.out.println("Test 4");
	}
}
