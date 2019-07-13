package seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
  @Test(dataProvider = "login")
  public void loginTest(String username, String password) {
	  System.out.println(username + " " + password);
  }

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
    	{"username1","password1"},{"username2","password2"},{"username3","password3"}
    };
  }
}
