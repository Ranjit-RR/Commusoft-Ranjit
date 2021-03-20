package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.LoginPage;

public class Karna extends Baseclass {

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
	public void PO() throws InterruptedException
	{
		Customer customer = new Customer(driver);
		customer.Add_Customer();
		Thread.sleep(8000);
		 // get the code from Customer page using driver inside the Wrapper
		Thread.sleep(7000);
		CreateJob job = new CreateJob(driver);
		job.addjob(); // get the code from CreateJob page using the object job
		job.JobDescription("No Rules");// get the code from CreateJob page using the object job
		job.createjob();// get the code from CreateJob page using the object job
		Thread.sleep(7000);
		job.JobCost();
		job.JobCostPO();
		
	}
	
	
}
