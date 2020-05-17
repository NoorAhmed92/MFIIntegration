package testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import testBase.TestBase;
import testPages.HomePage;

public class TC_HomePage_001 extends TestBase {
	
	HomePage hp ;
	
	@Test(priority=1)
	public void homePageSearchItem() throws IOException{
		hp = new HomePage(driver);
		hp.setSearchValue();
		hp.clickOnSearchIcon();
		
	    Reporter.log("Successfully landed to united states");
	    logger.info("Successfully landed to united states");
		
		
		
		
	}
}
