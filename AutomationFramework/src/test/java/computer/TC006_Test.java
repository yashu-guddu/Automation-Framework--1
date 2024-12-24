package computer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC006_Test extends BaseClass {

	@Test
	public void clickOnComputers() {
		test = extReport.createTest("clickOnComputers");
		hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Cpmputers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");
		Reporter.log("from guithub", true);
	}
}
