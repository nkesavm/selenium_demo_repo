package seleniumtest;

import org.testng.annotations.Test;

public class Test11 {
	
	@Test(groups= {"test1"})
	public void set1() {
		System.out.println("Group 1");
	}
	
	@Test(groups= {"test2"}, description="Testing testng group")
	public void set2() {
		System.out.println("Group 2");
	}
	
	@Test(groups= {"test1"})
	public void set3() {
		System.out.println("Group 3");
	}
	
	@Test(groups= {"test2"})
	public void set4() {
		System.out.println("Group 4");
	}

}
