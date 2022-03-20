package utils;

import java.util.Set;

import PageObjects.PracticePage;
import TestBase.TestBase;

public class TestUtils extends TestBase{
	
	PracticePage pp=new PracticePage();
	
	
	
	public void WindowHandling()
	
	{
		
	
		pp.OpenWindow();
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		
	    Set<String> AllWIndows=driver.getWindowHandles();
	    int Size=AllWIndows.size();
	    System.out.println(Size);
	    
	    for(String str:AllWIndows)
	    {
	    	if(!ParentWindow.equalsIgnoreCase(str))
	    	{
	    		driver.switchTo().window(str);
	    		String ChildWindowTitle=driver.getTitle();
	    		System.out.println(ChildWindowTitle);
	    	}
	    }
		

	}
	
	

}
