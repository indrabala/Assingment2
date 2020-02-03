package Scritps;
import org.testng.annotations.Test;

import Generics.BaseTest;
import Pages.HomePage;
import Pages.HotelPage;
import Pages.ResultPage;
import Pages.ReviewPage;

public class TripRevieTest extends BaseTest{
	
	
	@Test
	public void TripTest() throws Throwable {
	HomePage hm=new HomePage(driver);

	String hotelname = flib.read_XL_data("hname",3,0);
	String hotelname1 = flib.read_XL_data("hname",1,0);
	String hotelname2 = flib.read_XL_data("hname",2,0);
	
	System.out.println(hotelname);
   ResultPage RESPAGE= hm.senttextserchboxclickss(hotelname);
     System.out.println("data stored");
     
 	HotelPage HOTELP = RESPAGE.clickfirstresult1();
 	ReviewPage REVP = HOTELP.ShiftToReviewPage();
 	REVP.getReview(hotelname1,hotelname2 );
 	
 	
 	
 
	}
		
	
	
	
	
	
	
	
	}





