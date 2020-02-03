package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BaseTest;

public class ReviewPage extends  BaseTest{
		public WebDriver driver;
		
		
	     @FindBy(id="bubble_rating")
		 private WebElement rating;
		  
	     @FindBy(id="ReviewTitle")
		 private WebElement tr;
	     @FindBy(id="ReviewText")
	     private WebElement rt; 
		 @FindBy(tagName="title")
		 private WebElement title; 
		 @FindBy(id="qid11_bubbles")
		 private WebElement room;
		  @FindBy(id="qid12_bubbles")
		  private WebElement services;
	     @FindBy(id="qid13_bubbles")
		  private WebElement value;
	      @FindBy(id="qid14_bubbles")
		 private WebElement clean;
		  
		
		  @FindBy(id="qid47_bubbles")
		 private WebElement LOCATION;
			  
		  @FindBy(id="qid190_bubbles")
		 private WebElement QUALITY;
		  
			  
		      @FindBy(id="noFraud")
	         private WebElement chccb;
		
		
		
		public ReviewPage(WebDriver driver)
		{      this.driver=driver;
			PageFactory.initElements(driver,this );
		}
		/**
		 * method to give review
		 * @param reviewTit
		 * @param description
		 * @throws InterruptedException
		 */
		
		
		public void getReview(String reviewTit, String description) throws InterruptedException
		{   genlib.ActionforMoveToElement(driver, rating );
			tr.sendKeys(reviewTit);
			rt.sendKeys(description);
			if(services.isDisplayed())
			{
				genlib.ActionforMoveToElement(driver, services );
			}
			if(value.isDisplayed())
			{
				genlib.ActionforMoveToElement(driver, services );
			}
			if(QUALITY.isDisplayed())
			{
				genlib.ActionforMoveToElement(driver, services );
			}
			if(LOCATION.isDisplayed())
			{
				genlib.ActionforMoveToElement(driver, services );
			}
			if(clean.isDisplayed())
			{
				genlib.ActionforMoveToElement(driver, services );
			}
			if(room.isDisplayed())
			{
				genlib.ActionforMoveToElement(driver, services );
			}
			
			
			chccb.click();
			
			
			
		}
		
		
		
		
		
		
		
		

	}



