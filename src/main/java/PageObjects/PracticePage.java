package PageObjects;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class PracticePage extends TestBase{ 
	//PracticePageTestCase class is extend or inherited the TestBase class or TestBase class property(Methods, varibles i.e webdriver driver)
	
	@FindBy(xpath = "//input[@value='radio1']")
	private WebElement Radiobutton;
	
	@FindBy(id = "autocomplete")
	private WebElement SuggessionClassExample;
	
	//@FindBy(xpath = "//ul[@id='ui-id-1']//li")
	//By SuggessionList;
	
	@FindBy(id = "dropdown-class-example")
	 private WebElement DropdownExample;
	
	@FindBy(xpath = "//input[@name='checkBoxOption1']")
	private WebElement Checkbox;
	
	@FindBy(id = "openwindow")
	private WebElement SwitchWindowExample;
	
	private By user=By.xpath("");

	
	public PracticePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Radiobutton1()
	{
		Radiobutton.click();
	}
	
	public void SuggessionClassExample(String SendKeys)
	{
		SuggessionClassExample.sendKeys(SendKeys);
		
		List<WebElement>SuggesstionList= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		int Size=SuggesstionList.size();
		System.out.println(Size);
		
		for(WebElement ele:SuggesstionList)
		{
			String SugesstionListValue=ele.getText();
			System.out.println(SugesstionListValue);
			
			if(SugesstionListValue.equalsIgnoreCase("India"))
			{
				ele.click();
				break;
			}
		}
		
	}
	
	
	 public void Dropdown(String DropdownValue)
	{
		Select select=new Select(DropdownExample);
		select.selectByVisibleText(DropdownValue);
		
	}
	
	public void Checkbox1()
	{
		Checkbox.click();
	}
	
	
	public void OpenWindow()
	{
		SwitchWindowExample.click();
		
	}
	

}
