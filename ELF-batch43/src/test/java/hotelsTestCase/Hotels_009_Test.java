package hotelsTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;

public class Hotels_009_Test extends BaseClass {
@Test
public void isolation() {
	homePage.getHotelsNavBar().click();
	explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
	hotelPage.getIsolationCheckBox().click();
}
}
