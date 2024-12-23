package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(linkText = "Male")
	private WebElement MaleradioButton;

	@FindBy(linkText = "Female")
	private WebElement FemaleradioButton;

	@FindBy(id = "FirstName")
	private WebElement FirstNameTextfield;

	@FindBy(id = "LastName")
	private WebElement LastNameTextfield;

	@FindBy(id = "Email")
	private WebElement EmailTextfield;

	@FindBy(id = "Password")
	private WebElement PasswordTextfield;

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordTextfield;

	@FindBy(id = "register-button")
	private WebElement RegisterButton;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleradioButton() {
		return MaleradioButton;
	}

	public WebElement getFemaleradioButton() {
		return FemaleradioButton;
	}

	public WebElement getFirstNameTextfield() {
		return FirstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return LastNameTextfield;
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getConfirmPasswordTextfield() {
		return ConfirmPasswordTextfield;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
}
