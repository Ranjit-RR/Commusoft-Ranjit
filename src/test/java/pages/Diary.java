package pages;

import org.openqa.selenium.WebDriver;

import action.Wrapper;

public class Diary extends Wrapper {
	public Diary(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	public void Diary_Module()
	{
		click("//a[text()='Diary']");
	}
	public void Diary_Daily()
	{
		try
		{
		click("//button[text()='Daily']");
		}catch(Exception e)
		{
			
		}
		
	}
	public void Diary_Today() throws InterruptedException
	{
		Thread.sleep(3000);
		try {
			click("//a[text()='Today']");
			Thread.sleep(3000);
			click("(//div[@class='fc-row fc-week fc-widget-content'])[2]");
		}catch(Exception e)
		{
			Thread.sleep(3000);
			click("(//a[@class='icon ss-navigateright'])[1]");
			Thread.sleep(3000);
			click("//a[text()='Today']");
		}
	}
	public void Diary_PM() throws InterruptedException
	{
		click("(//div[@class='fc-row fc-week fc-widget-content'])[2]");
	}
	public void Diary_EventFromJob() throws InterruptedException
	{
		click("//button[@ng-click='saveDiaryEvent()']");
	}
	public void Diary_Timing()
	{
		click("(//td[@class=\"fc-widget-content\"])[10]");
	}
	public void Diary_Normal_EvenDescription()
	{
		type("//input[@name='description']", "Normal Event");
	}
	public void Diary_Save()
	{
		click("(//span[text()='Save'])[2]");
	}
	public void Diary_Estimate()
	{
		click("//a[text()='Estimate']");
	}
	public void Diary_job()
	{
		click("//a[text()='Job']");
	}
	public void Diary_propertysearch() throws InterruptedException
	{
		type("//input[@id='top-input-in-event-type']", "Ranjit");
		typeenter("//input[@id='top-input-in-event-type']");
		Thread.sleep(5000);
		click("(//input[@name='selected_property'])[1]");
		Thread.sleep(5000);
	}
	public void Diary_Estimate_EventDescription()
	{
		selectdropdownvalue("//select[@ng-change='setEstimateDescription()']", "1");
	}
	public void Diary_Job_EventDescription()
	{
		selectdropdownvalue("//select[@name='description']", "1");
	}
	

}
