package pages;

import javax.naming.directory.SearchControls;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class CreateJob extends Wrapper {
	
	public CreateJob(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void addjob() throws InterruptedException
	{
		click("//a[@id='newJob']");
		Thread.sleep(1000);
	}
	public void JobDescription(String a) throws InterruptedException
	{
		searchengine search = new searchengine(driver);
		search.searchbox_jobDescription(a);
		Thread.sleep(3000);
	}
	public void createjob()
	{
		click("//span[text()='Add job']");
	}
	public void jobdetail()
	{
		click("(//a[text()='Details'])[2]");
	}
	public void edit_job() throws InterruptedException
	{
		click("(//a[text()='Edit'])[1]");
		Thread.sleep(1000);
	}
	public void complete_job() throws InterruptedException
	{
		click("//input[@formcontrolname='completed']");
		Thread.sleep(3000);
		click("(//span[text()='Save'])[2]");
	}
	public void Add_new_diaryEvent()
	{
		click("//span[text()='Add new diary event']");
	}
	public void JobCostSupplierSearch(String a) throws InterruptedException
	{
		searchengine search = new searchengine(driver);
		search.searchbox_jobCostSuppliersearch(a);
		Thread.sleep(3000);
	}
	public void JobCost()
	{
		click("//span[text()='Costs']");
	}
	public void JobCostPO() throws InterruptedException
	{
		click("(//a[@class=\"btn btn-primary btn-small ng-scope\"])[3]");//Click PO		
		//CreateJob po = new CreateJob (driver);
		JobCostSupplierSearch("supplier");
		dclick("(//td[@class=\"overflow_handsontable select_icon afterHiddenColumn firstVisibleColumn htPlaceholder\"])[1]");
		clear("(//input[@type=\"text\"])[11]");
		type("(//input[@type=\"text\"])[11]", "Par"); 
		Thread.sleep(3000);
		typeenter("(//input[@type=\"text\"])[11]");
		Thread.sleep(4000);
		dclick("(//td[@class=\"overflow_handsontable select_icon afterHiddenColumn htPlaceholder\"])[1]");
		clear("(//input[@class=\"select2-input\"])[4]");
		type("(//input[@class=\"select2-input\"])[4]", "Part");
		typeenter("(//input[@class=\"select2-input\"])[4]");
		dclick("(//td[@class=\"overflow_handsontable select_icon htPlaceholder\"])[1]");
		clear("(//input[@class=\"select2-input\"])[4]");
		type("(//input[@class=\"select2-input\"])[4]", "Delivery to office");
		typeenter("(//input[@class=\"select2-input\"])[4]");
		Thread.sleep(5000);
		dclick("(//td[@class=\"afterHiddenColumn firstVisibleColumn\"])[1]");
		type("(//textarea[@class=\"handsontableInput\"])[3]", "Items");
		typeenter("(//textarea[@class=\"handsontableInput\"])[3]");
		dclick("(//td[@class=\"overflow_handsontable\"])[3]");
		clear("(//textarea[@class=\"handsontableInput\"])[4]");
		type("(//textarea[@class=\"handsontableInput\"])[4]", "100");
		typeenter("(//textarea[@class=\"handsontableInput\"])[4]");
		Thread.sleep(3000);
		dclick("(//td[@class=\"overflow_handsontable select_icon afterHiddenColumn htPlaceholder\"])[2]");
		typeenter("(//input[@type='text'])[14]");
		Thread.sleep(3000);
		click("(//span[@class=\"ng-scope\"])[15]");
		
	}
	

}

