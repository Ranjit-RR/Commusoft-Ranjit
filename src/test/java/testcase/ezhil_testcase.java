package testcase;

import org.openqa.selenium.By;
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

public class ezhil_testcase extends Baseclass {
	
	String homepage;
   
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		driver.get("https://dev.commusoft.net/customers");
	}
	@Test(priority = 1)
	public void Addpayment_job() throws InterruptedException
	{
		driver.findElement(By.xpath("id='customertypecustomer'")).click();
		Thread.sleep(3000);
	}
	
		
}



