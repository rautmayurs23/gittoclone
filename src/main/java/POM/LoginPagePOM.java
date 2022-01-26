package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePOM {

	@FindBy(how = How.XPATH, using = "//input[@class='inputtext _55r1 _6luy']")
	private WebElement getEmailInput;
	@FindBy(how = How.XPATH, using = "//input[@class='inputtext _55r1 _6luy _9npi']")
	private WebElement getPasswordInput;
	@FindBy(how = How.XPATH, using = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement getLoginBtn;

	public WebElement getGetEmailInput() {
		return getEmailInput;
	}

	public WebElement getGetPasswordInput() {
		return getPasswordInput;
	}

	public WebElement getGetLoginBtn() {
		return getLoginBtn;
	}

}
