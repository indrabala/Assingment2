package Generics;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generics {
		
		
		
		public void waitforElementToBeVisible(WebElement element, WebDriver driver) {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(element));

		}
		/**
		 * method for different values
		 * @return
		 */

		public String getRandomNum() {
			Random rd = new Random();
			return "udhyog" + rd.nextInt(10000);
		}
	/**
	 * method for element to be visible
	 * @param driver
	 * @param element
	 */
		
		
		
		public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		/**
		 * method for customized wait for element to be clikcable
		 * @param element
		 * @param driver
		 * @throws InterruptedException
		 */

		public void waitAndClickElement(WebElement element, WebDriver driver) throws InterruptedException {
			int count = 0;
			while (count <= 20)
				try {
					element.click();
					// driver.findElement(By.xpath("By.xpath(//input[@title='Save[Alt+S]']")).click();
					break;
				} catch (Throwable t) {
					Thread.sleep(2000);
					count++;
				}
		}
		/**
		 * method for handling dropdown by value
		 * @param element
		 * @param option
		 */

		public void select(WebElement element, String option) {
			Select sc = new Select(element);
			sc.selectByValue(option);

		}
		/**
		 * method to handle dropdowndown by index
		 * @param element
		 * @param option
		 */

		public void select(WebElement element, int option) {
			Select sc = new Select(element);
			sc.selectByIndex(option);

		}
	/**
	 * method to wait for elements to be loaded
	 * @param driver
	 */
		public void waitForElementToLoad(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// driver.manage().window().maximize();
		}
	/**
	 * method for maximizing window
	 * @param driver
	 */

		public void maximize(WebDriver driver) {
			driver.manage().window().maximize();
		}
	/**
	 * method for moving mouse on element
	 * @param element
	 * @param driver
	 */
		public void moveMouseOnElement(WebElement element, WebDriver driver) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
		}
	/**
	 * method to handle popup
	 * @param driver
	 */
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
	/**
	 * method to handle popup
	 * @param driver
	 */
		public void cancleAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}

		/**
		 * method to switch to child window
		 */
		String parentWindowID;
		String childWindowID;
	  //  String ThridWindowid;
		public void switchToChildWindow(WebDriver driver) {
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			parentWindowID = it.next();
			childWindowID = it.next();
			//ThridWindowid = it.next();
			driver.switchTo().window(childWindowID );
		}
		
		/**
		 * method to scroll down the window
		 * @param element
		 * @param driver
		 * @throws InterruptedException
		 */
		
		public void scroll(WebElement element,WebDriver driver) throws InterruptedException
		{    
			waitForElementToBeVisible(driver,element);
			
			int yax=element.getLocation().getY();
			JavascriptExecutor JS=  (JavascriptExecutor)driver;
			JS.executeScript("window.scrollTo(0,"+yax+")");
		}
		/**
		 * method to handle mouse movement
		 * @param element
		 * @param driver
		 */
		public void moveMouseOnElement1(WebElement element, WebDriver driver)
		{  Actions act=new Actions(driver);
		  act.moveToElement(element,10,10).perform();
		  try
		  { Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  }  
		  act.moveToElement(element,20,10).perform();
		  try
		  { Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  }   
		  act.moveToElement(element,30,10).perform();
		  try
		  { Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  } 
		  act.moveToElement(element,40,10).perform();
		  try
		  { Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  }   
		  act.moveToElement(element,50,10).perform();
		  try
		  { Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
			  e.printStackTrace();
		  }   
			  
		} 
		/**
		 * method for mouse hovering
		 * @param driver
		 * @param element
		 * @throws InterruptedException
		 */
			  
		 public void ActionforMoveToElement(WebDriver driver ,WebElement element) throws InterruptedException 
		 { Actions act=new Actions(driver);
		   int i;
		   for(i=0;i<50;){
			   act.moveToElement(element,i, 1).perform();
			   Thread.sleep(1000);
			   i=i+10;
		   }
		   if(i<=50)
		   {
			   act.moveToElement(element, 50, 1).click().perform();
			   
		   } 
			   
		 }	   
			   
		   
	    /**
	   * method to move to parent window
	    * @param driver
	    */
		public void switchToParentWindow(WebDriver driver) {
			driver.switchTo().window(parentWindowID);
		}
		


	}






