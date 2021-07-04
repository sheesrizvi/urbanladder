package TestCaseClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import pageClasses.BookShelvesPage;
import pageClasses.GiftCardPage;
import pageClasses.HomePage;

public class BeingAtHomeTest extends BaseTestClass {
	
	HomePage hg;
	GiftCardPage card;
	BookShelvesPage shelves;
	
	@Test
	public void abc() throws Exception
	{
		logger = report.createTest("Get Being-At-Home List Test : ");
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		hg = pageBase.OpenApplication();
		hg.handlePopUp();
		Thread.sleep(2000);
		hg.beingAtHome();	
	}	
}
