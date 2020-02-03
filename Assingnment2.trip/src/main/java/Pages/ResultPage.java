package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BaseTest;
import Pages.HotelPage;


	public class ResultPage extends BaseTest {
		
		public WebDriver driver;
		
		@FindBy(xpath="//span[text()='Club Mahindra Madikeri, Coorg']")
		private WebElement firstresult;
		
		public WebElement getfirstresult()
		{ return firstresult;
		}
		
		public  ResultPage(WebDriver driver)
		{ this.driver=driver;
		PageFactory.initElements(driver, this);
			
		}
		
			
		public void clickfirstresult()
		{  firstresult.click();
		}
		/**
		 * method for shifting to hotel page
		 * @return
		 */
		public HotelPage clickfirstresult1()
		{  firstresult.click();
		   genlib.switchToChildWindow(driver);
		return new HotelPage(driver);
		}
		
		
		
		
		
		
		
		
		

	}

		
		
		
		
		
		
		
		
		

	



