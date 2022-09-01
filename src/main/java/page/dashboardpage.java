package page;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;





public class dashboardpage{
WebDriver driver;


public dashboardpage(WebDriver driver) {
this.driver = driver;
}
	@FindBy(how = How.XPATH, using ="//h2[contains(text(),' Dashboard ')]")WebElement DASHBORADHEADER_ELEMENT;
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Customers')]")WebElement CUSTOMER_ELEMENT;
@FindBy(how = How.XPATH, using ="//a[contains(text(), 'Add Customer')]")WebElement ADDCUSTOMERS_ELEMENT;


//corresponding method
public void validatedashboardpage() {

Assert.assertEquals(DASHBORADHEADER_ELEMENT.getText(), "Dashboard", "page is wrong");
}
public void clickcustomerbutton() {
	System.out.println("Coming here customer click");
	CUSTOMER_ELEMENT.click();
}
public void clickaddcustomer() {
	System.out.println("Coming here 123");
	ADDCUSTOMERS_ELEMENT.click();
}
}