package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	WebDriver driver;
	
	//constructor
	public Loginpage(WebDriver driver)
	{
	this.driver= driver;
	}
	
	
 // webelement list
	//webelement 
	//by
	//@FindBy
	//type name = value
	@FindBy (how = How.XPATH,using = "//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy (how = How.XPATH,using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy (how = How.XPATH,using = "//button[@name='login']") WebElement SUBMIT_ELEMENT;
	
	//corresponding methods 
	public void insertuname (String un) {
		 USERNAME_ELEMENT.sendKeys( un);
		 }	
	public void insertpwoed(String pw) {
		 PASSWORD_ELEMENT.sendKeys(pw);
		}	
	public void insertunsubmit() {
		 SUBMIT_ELEMENT.click(); 
	}	
}
	
	
	