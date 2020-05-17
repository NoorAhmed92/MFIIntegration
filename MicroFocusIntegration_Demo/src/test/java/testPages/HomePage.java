package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;
import testUtilities.ReadAPI;

public class HomePage extends TestBase{
	public ReadAPI api;
	
	
	@FindBy(xpath="//div[@id='gs_lc50']/input[@name='q']")
	private WebElement searchTextbox;
	
	@FindBy(xpath="//div[@class='searchbox-searchbutton-container']/button[@id='searchbox-searchbutton']")
	private WebElement searchIcon;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setSearchValue() {
		api= new ReadAPI();
		searchTextbox.sendKeys(api.getDataFromAPI());
	}
	
	public void clickOnSearchIcon() {
		searchIcon.click();
	}
	
	

}
