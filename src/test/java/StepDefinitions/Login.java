package StepDefinitions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

import MBPageFactory.S1page;
import MBPageFactory.S2Info;
import MBPageFactory.S3NP;


import MBPageFactory.S4ViewDetails;
import MBPageFactory.S5TopAgent;

import MBPageFactory.loginPF;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Before 
	public void before()
	{
		/*
		 * driver= new ChromeDriver(); 
		 * 
		 */
		    ChromeOptions opt = new ChromeOptions(); 
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			driver.get("https://www.magicbricks.com/");
			driver.manage().window().maximize();
	}
	@Given("I am on Magic Bricks App Login")
	public void i_am_on_magic_bricks_app_login() {
	    // Write code here that turns the phrase above into concrete actions
	
	    loginPF lp=new loginPF(driver);
	    lp.login();
	    lp.logging();
	}

	@When("I enter Email ID as {string}")
	public void i_enter_email_id_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		loginPF lp=new loginPF(driver);
		String child_handle="";
	    Set<String> tab_handles = driver.getWindowHandles();
	    for (String child:tab_handles){
	        child_handle= child;
	    }
	    driver.switchTo().window(child_handle);
	    lp.mail(string);
 
	}
	
	@When("I click on Next")
	public void i_click_on_next() {
	    // Write code here that turns the phrase above into concrete actions
		loginPF nex=new loginPF(driver);
		nex.nxt();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		loginPF pw=new loginPF(driver);
		pw.password(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		loginPF lo=new loginPF(driver);
		lo.log();
	}
	@When("I click on Continue")
	public void i_click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
		loginPF co=new loginPF(driver);
		co.conti();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	}


	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		loginPF cr=new loginPF(driver);
		cr.end();
	}

	@Given("Iam on magicbricks page")
	public void iam_on_magicbricks_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@Given("I click on Buy dropdown")
	public void i_click_on_buy_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		S1page s1=new S1page(driver);
		s1.buy();
		
	}

	@Given("I click on Popular Choices")
	public void i_click_on_popular_choices() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("I click on Ready to move")
	public void i_click_on_ready_to_move() {
	    // Write code here that turns the phrase above into concrete actions
	    S1page ss=new S1page(driver);
	    ss.move();
	}

//	@Then("ready to move flats page will be displayed")
//	public void ready_to_move_flats_page_will_be_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Given("ready to move flats page will be displayed")
	public void ready_to_move_flats_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("I click on Properties")
	public void i_click_on_properties() {
	    // Write code here that turns the phrase above into concrete actions
	    S2Info s2=new S2Info(driver);
	    s2.prop();
	}

	@Then("I click on Get Info")
	public void i_click_on_get_info() {
	    // Write code here that turns the phrase above into concrete actions
	   S2Info s2=new S2Info(driver);
	   s2.info();
	}

	@Given("Iam on Magic Bricks App Login Page")
	public void iam_on_magic_bricks_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("I click on New Projects")
	public void i_click_on_new_projects() {
	    // Write code here that turns the phrase above into concrete actions
	    S3NP s3=new S3NP(driver);
	    s3.NewProject();
	}

	@Given("Page of new project page will be displayed")
	public void page_of_new_project_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("I click on Particular Location")
	public void i_click_on_particular_location() {
	    // Write code here that turns the phrase above into concrete actions
	    S3NP pl=new S3NP(driver);
	    pl.patLoc();
	}

	@Given("projects of particular location will be displayed")
	public void projects_of_particular_location_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I click on Contact Builder")
	public void i_click_on_contact_builder() {
	    // Write code here that turns the phrase above into concrete actions
	    S3NP cb=new S3NP(driver);
	    cb.contBul();
	}

	@Given("ready to move flats page will displayed")
	public void ready_to_move_flats_page_will_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click on View Details")
	public void click_on_view_details() {
	    // Write code here that turns the phrase above into concrete actions
	    S4ViewDetails vd=new S4ViewDetails(driver);
	    vd.ViewDetails();
	}

	@Given("click on Top Agents")
	public void click_on_top_agents() {
	    // Write code here that turns the phrase above into concrete actions
	    S5TopAgent ta=new S5TopAgent(driver);
	    ta.Agent();
	}

	@Given("Top agents page will be displayed")
	public void top_agents_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click on Contact Agent")
	public void click_on_contact_agent() {
	    // Write code here that turns the phrase above into concrete actions
	    S5TopAgent ca=new S5TopAgent(driver);
	    ca.ConAg();
	}
	


	
}


