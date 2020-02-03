package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BaseTest;


	public class HotelPage  extends BaseTest{
		public WebDriver driver;

		@FindBy(xpath="//a[text()='Most Booked Properties in Madikeri']")
		private WebElement link;
		
		public WebElement getLink()
		{ return link;
		}
		
	    public HotelPage( WebDriver driver)
		{ this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	    
		  @FindBy (xpath="//a[text()='Write a review']")
		  private WebElement wart;
		  
		  public WebElement getwart()
		  {  return wart;
		  }
		  
		  public void clickOnWART()
		  { wart.click();
		  }
		  /**
		   * method for shifting to revew page
		   * @return
		   * @throws InterruptedException
		   */
		
		 public ReviewPage ShiftToReviewPage() throws InterruptedException
		  { genlib.scroll(link, driver);
		    genlib.waitforElementToBeVisible( wart, driver);
		    wart.click();
		 Set<String> whs = driver.getWindowHandles();
		 
		    whs.remove(0);
		    whs.remove(1);
		    for(String wh:whs)
		    	driver.switchTo().window(wh);
		    
		    return new ReviewPage(driver);
		    
		  }
		  
		  
		  
		}
		
		



	
	
	
	
	

