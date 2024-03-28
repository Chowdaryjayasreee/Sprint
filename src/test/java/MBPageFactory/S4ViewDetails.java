package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S4ViewDetails{
	WebDriver driver; 
	public S4ViewDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='buyheading']")
	WebElement Buy;
	@FindBy(xpath="//div[@id='newprojects']/div[2]/div[2]/div[4]/div[1]/div[2]/span[2]")
	WebElement viewDetails;
	
	public void buy()
	{
		Buy.click();
	}

    public void ViewDetails() {
    	viewDetails.click();
    }
}


