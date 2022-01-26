package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.LoginPagePOM;
import Utility.BaseClass;
import Utility.Library;

public class VerifyLogin extends BaseClass {

	WebDriver driver;

	@Test
	public void veriflogin() {
		LoginPagePOM login = PageFactory.initElements(driver, LoginPagePOM.class);
		Library.custom_SendKeys(login.getGetEmailInput(), Excel.getExcelData("sheet1", 0, 0));
		Library.custom_SendKeys(login.getGetPasswordInput(), Excel.getExcelData("sheet1", 1, 0));
		Library.custom_Click(login.getGetLoginBtn());
	}

}
