package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.Diary;
import pages.Estimate;
import pages.Invoice;
import pages.LoginPage;
import pages.NotesandCommunication;

public class Checking2 extends Baseclass {
	
	String homepage;
   
	
	
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(sheet.sheetIN("Login",0, 1),sheet.sheetIN("Login",1, 1),sheet.sheetIN("Login", 2, 1));
		Thread.sleep(1000);
		homepage = driver.getCurrentUrl();
	}
	@Test(priority = 1)
	public void Addpayment_job() throws InterruptedException
	{
		driver.get("https://app.commusoft.co.uk/customers/customer/1045/view/property/view");
		Thread.sleep(4000);
		CreateJob job = new CreateJob(driver);
		job.addjob();
		job.JobDescription("No Rules");
		job.createjob();

	}
	
		
}



