package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S3NP {
	WebDriver driver; 
	public S3NP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='buyheading']")
	WebElement Buy;
	@FindBy(xpath="//div[@id='body']/div[4]/div/div/div[1]/div[2]/ul/li[2]/a")
	WebElement np;
	
	@FindBy(xpath="//div[@id='newprojects']/div[2]/div[2]/div[4]/div[1]/div[2]/span[1]")
	WebElement conBul;
		
	public void buy()
	{
		Buy.click();
	}
	public void NewProject()
	{
	   np.click();
	}
	
}
