package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addcustomerpage extends BasePage {
	WebDriver driver;


	public Addcustomerpage(WebDriver driver) {
	this.driver = driver;
	}
		@FindBy(how = How.XPATH, using ="//input[@id= 'account']")WebElement FULLNAME_ELEMENT;
		@FindBy(how = How.XPATH, using ="//select[@id= 'cid']")WebElement COMPANYDROPDOWN_ELEMENT;
		@FindBy(how = How.XPATH, using ="//input[@id='email']")WebElement EMAIL_ELEMENT;
		@FindBy(how = How.XPATH, using ="//input[@id= 'phone']")WebElement PHONE_ELEMENT;

		//in this string method when we do .generatRandomNum get it 
		public void insertfullname(String fn) {
	String ifn = fn + generateRandomNum(999);
			FULLNAME_ELEMENT.sendKeys(ifn);
		}
	public void selectCOMPANYDROPDOWN(String COMPANY) {
//			Select sel = new Select(COMPANYDROPDOWN_ELEMENT);
//			sel.selectByVisibleText(COMPANY);
selectFromDropdown(COMPANYDROPDOWN_ELEMENT, COMPANY);
	}
public void insertEmail (String email) {
String insertedemail = generateRandomNum(999) + email;
 EMAIL_ELEMENT.sendKeys(insertedemail);
}	
public void insertphone (String pn) {
	
	PHONE_ELEMENT.sendKeys(pn + generateRandomNum(999));
	}	


	}
		
//public int generateRandomNum(int boundaryNum) {
//	Random ran = new Random();
//	int generatedNum = ran.nextInt(boundaryNum);
//	return generatedNum;
//}	
