package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S1page {
	WebDriver driver; 
	public S1page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='buyheading']")
	WebElement Buy;
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[1]/div/div/div/div/div[1]/ul/li[1]/a")
	WebElement ReadyToMove;
	public void buy()
	{
		Buy.click();
	}
	public void move()
	{
		ReadyToMove.click();
	}
}
