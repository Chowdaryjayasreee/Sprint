package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S5Viewdetails{
	WebDriver driver; 
	public S5Viewdetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='buyheading']")
	WebElement Buy;
	
	@FindBy(xpath="//div[@id='topAgentCard']//div[1]/div[1]/div[2]/div[2]/a[2]")
	WebElement viewDetails;
	public void buy()
	{
		Buy.click();
	}

		
	
	public void details() {
		viewDetails.click();
	}
	
	

}
