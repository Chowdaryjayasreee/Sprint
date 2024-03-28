package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2Info {
	WebDriver driver; 
	public S2Info(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='buyheading']")
	WebElement Buy;
    @FindBy(xpath="//div[@id='body']/div[4]/div/div/div[1]/div[2]/ul/li[1]/a")
    WebElement Properties;
	@FindBy(xpath="//div[@id='cardid71945489']/div/div[2]/div[2]/span[2]")
	WebElement GetInfo;
	public void buy()
	{
		Buy.click();
	}
    public void prop()
    {
       Properties.click();
    }
	public void info()
	{
		GetInfo.click();
	}

	
	

}
