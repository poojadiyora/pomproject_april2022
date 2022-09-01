package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Addcustomerpage;
import page.Loginpage;
import page.dashboardpage;
import util.Browsefactory1;

public class addcustomertest {
	static WebDriver driver;
//logindata
	static String username = "demo@techfios.com";
	static String password = "abc123";
	// testdata
	static String fullname = "java selenium";
	static String company = "Gold";
	static String email = "pooja@gmail.com";
	static String phone = "4459993400";

	@Test
	public static void validusershouldbeabletolonin() throws InterruptedException {
		driver = Browsefactory1.init();
        Thread.sleep(4000);
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.insertuname(username);
		login.insertpwoed(password);
		login.insertunsubmit();

		dashboardpage dbp = PageFactory.initElements(driver, dashboardpage.class);
		dbp.validatedashboardpage();
		dbp.clickcustomerbutton();
		dbp.clickaddcustomer();

		Addcustomerpage addcustomerpage = PageFactory.initElements(driver, Addcustomerpage.class);
		addcustomerpage.insertfullname(fullname);
		addcustomerpage.selectCOMPANYDROPDOWN(company);
        addcustomerpage.insertEmail(email);
        addcustomerpage.insertphone(phone);
		// Browsefactory1.teardown();

	}
}
