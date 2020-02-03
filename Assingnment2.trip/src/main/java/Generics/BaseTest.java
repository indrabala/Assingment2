package Generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public Generics genlib = new Generics();
	public FileUtils flib = new  FileUtils();
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","./DRIVER1/ChromeDriver.exe");
	}

	@BeforeClass
	public void configBC() throws IOException {
		String Browsername = flib.readDataFromPropertiesFile("BROWSER");
		System.out.println("======launch browser============");
		if (Browsername.equals("CHROME")) {
			driver = new ChromeDriver();
			genlib.waitForElementToLoad(driver);
			genlib.maximize(driver);
		} else {
			driver = new FirefoxDriver();
			genlib.waitForElementToLoad(driver);
			genlib.maximize(driver);

		}
	}

	@BeforeMethod
	public void configBM() throws IOException {
		String URLNAME = flib.readDataFromPropertiesFile("URL3");
		driver.get(URLNAME);
		genlib.waitForElementToLoad(driver);
		

	}

	@AfterMethod
	public void configAM() {
		
     driver.close();
     driver.quit();
	}

	/*@AfterClass
	public void config() {
		System.out.println("close the browser");
		driver.close();
	}
	
	*/



	
	

}
