package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S4TopAgent{
	WebDriver driver; 
	public S4TopAgent(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='buyheading']")
	WebElement Buy;
	@FindBy(xpath="//div[@id='body']/div[4]/div/div/div[1]/div[2]/ul/li[3]/a")
	WebElement topAgent;
	
	public void buy()
	{
		Buy.click();
	}
	public void Agent() 
	{
		topAgent.click();

	} 
}


