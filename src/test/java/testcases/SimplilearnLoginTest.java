package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LogInPage;

public class SimplilearnLoginTest extends BaseClass {

	@Test
	public void Test1() {
		LogInPage lp = new LogInPage(driver);
		lp.LogIN("sanjay@gmail.com", "xyz@123");
       
		// Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));

		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActError, ExpError);
//		if (ActError.equals(ExpError)) {
//			System.out.println("TC PAssed");
//		} else {
//			System.out.println("Tc Failed");
//		}

		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total num of links are " + Links.size());

		for (int index = 0; index < Links.size(); index++) {

			System.out.println(Links.get(index).getAttribute("href"));

		}
	}

	@Test(enabled = false)
	@Parameters({"UName","Pswd"})
	public void Test2(String UserName, String Password) {
		LogInPage lp = new LogInPage(driver);
		lp.LogIN(UserName, Password);

	}
	@Test
	public void Test3() {
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password =sheet.getRow(0).getCell(1).getStringCellValue();
		LogInPage lp = new LogInPage(driver);
		lp.LogIN(UserName, Password);
	
	}

}
