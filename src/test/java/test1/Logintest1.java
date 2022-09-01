package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Loginpage;
import page.dashboardpage;
import util.Browsefactory1;

public class Logintest1 {

	static WebDriver driver;

 static String username= "demo@techfios.com";
 static String password = "abc123";

	@Test
	public static void validusershouldbeabletolonin() throws InterruptedException {
		driver = Browsefactory1.init();

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.insertuname(username);
		login.insertpwoed(password);
		login.insertunsubmit();

		dashboardpage dbp = PageFactory.initElements(driver, dashboardpage.class);
		dbp.validatedashboardpage();
     
        dbp.clickcustomerbutton();
     dbp.clickaddcustomer();
        
		Browsefactory1.teardown();
		
		
	}

}
