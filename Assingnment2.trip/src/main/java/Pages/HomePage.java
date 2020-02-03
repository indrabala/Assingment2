package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BaseTest;
import Pages.ResultPage;

public class HomePage extends BaseTest{
	  public WebDriver driver;
		@FindBy(xpath="(//input[@class='_3qLQ-U8m'])[2]")
		private WebElement searchbox2;
		
		@FindBy(xpath="(//input[@class='_3qLQ-U8m'])[1]")
		private WebElement searchbox1;
		
		
		
		public WebElement getsearchbox()
		{ return  searchbox1;
		}
		
		public  HomePage ( WebDriver driver)
		{ this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		public ResultPage senttextserchboxclickss(String s) throws InterruptedException
		{ 
		try{
		     genlib.waitForElementToBeVisible(driver, searchbox1);
	         searchbox1.sendKeys(s,Keys.ENTER);
		     
		}
		catch(Exception e)
			{  genlib.waitForElementToBeVisible(driver , searchbox2);
			searchbox2.sendKeys(s,Keys.ENTER);
			  
	         }
		return new ResultPage(driver);
		}
		
	    
	    
	    
	    
		
		
		
		
	}
		
		
		
			
		
		


			
			
		
			
		
		


