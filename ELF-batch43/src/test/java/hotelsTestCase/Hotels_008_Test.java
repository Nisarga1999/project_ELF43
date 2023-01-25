package hotelsTestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;

public class Hotels_008_Test extends BaseClass{
	@Test
	public void locators() {
		homePage.getHotelsNavBar().click();
		String destinationLocator = hotelPage.getDestinationLocator().getText();
		System.out.println(destinationLocator);
		
		String checkInLocator = hotelPage.getCheckInLocator().getText();
		System.out.println(checkInLocator);
		
		String checkOutLocator = hotelPage.getCheckOutLocator().getText();
		System.out.println(checkOutLocator);
		
		String roomAndGuestLocators = hotelPage.getRoomAndGuestLocator().getText();
		System.out.println(roomAndGuestLocators);
		
		String nationalityLocator = hotelPage.getNationalityLocator().getText();
		System.out.println(nationalityLocator);
		
		String residenceLocator = hotelPage.getResidenceLocator().getText();
		System.out.println(residenceLocator);
	}
}
