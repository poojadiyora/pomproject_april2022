package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public void selectFromDropdown(WebElement element,String visibalText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibalText);
	}
	
	
	public int generateRandomNum(int boundaryNum) {
		Random ran = new Random();
		int generatedNum = ran.nextInt(boundaryNum);
		return generatedNum;
	}	
	
}
