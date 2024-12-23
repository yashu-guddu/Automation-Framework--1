package giftcards;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC007_Test extends BaseClass {

	@Test
	public void clickOnGiftcards() {
		test = extReport.createTest("clickOnGiftcards");
		hp = new HomePage(driver);
		hp.getGiftcardsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "Gift Cards page is not displayed");
		test.log(Status.PASS, "Giftcards page is displayed");
	}
}
