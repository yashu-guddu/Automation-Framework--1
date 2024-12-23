package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC005_Test extends BaseClass {

	@Test
	public void clickOnBooks() {
		test = extReport.createTest("clickOnBooks");
		hp = new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Book", "Home page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}
}
