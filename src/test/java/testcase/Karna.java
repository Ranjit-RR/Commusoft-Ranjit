package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.CreateJob;
import pages.Customer;
import pages.LoginPage;
import pages.searchengine;

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
		searchengine search = new searchengine(driver);
		search.searchbox_supplier("supplier");
		search.searchbox_supplier_parts("Parts");
		search.searchbox_supplier_parts_nominalcode("Part");
		search.parts_deliverymethod("Delivery to Office");
		search.supplierpo_items("Item");
		job.PO_item_unitprice();
		search.searchbox_supplier_item_nominalcode("Parts");
		job.Add_PO_button();
		
		
	}
	
	
}
