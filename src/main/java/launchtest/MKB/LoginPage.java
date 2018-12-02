package launchtest.MKB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "txtUsername")
	WebElement userName;
	
	@FindBy(id = "txtPassword")
	WebElement passWord;
	
	@FindBy(id = "btnLogin")
	WebElement Login;
	
	public void enterUserName(String username) {
			userName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}
	
	public void clickLogin() {
		Login.click();
	}
	//https://opensource-demo.orangehrmlive.com/

}
