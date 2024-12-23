package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement GiftcardsLink;
	
	public WebElement getGiftcardsLink() {
		return GiftcardsLink;
	}

	public void setGiftcardsLink(WebElement giftcardsLink) {
		GiftcardsLink = giftcardsLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}
}
