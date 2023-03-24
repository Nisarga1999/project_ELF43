package hotelsTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;

public class Hotels_002_Test extends BaseClass {
	@Test(groups = "Functionality")
	public void destinationError() {

		homePage.getHotelsNavBar().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		hotelPage.getDestinationTextBox().click();
		hotelPage.getDestinationTextBox().clear();
		hotelPage.getSearchHotelButton().click();
		String errorMess = hotelPage.getDestinatiomErrorMes().getText();
		System.out.println(errorMess);
	}
}
