package seleniumtest;

import org.testng.annotations.Test;

public class TestngGroupTest {
	
	@Test(groups= {"Smoke"})
	public void setUp1() {
		System.out.println("Smoke test case1");
		
	}
	
	@Test(groups= {"Sanity"})
	public void setUp2() {
		System.out.println("Sanity test case1");
		
	}
	
	@Test(groups= {"Smoke"})
	public void setUp3() {
		System.out.println("Smoke test case2");
		
	}
	
	@Test(groups= {"Sanity"})
	public void setUp4() {
		System.out.println("Sanity test case2");
	}
	
	@Test(groups= {"Smoke"})
	public void setUp5() {
		System.out.println("Smoke test case3");
		
	}

}
