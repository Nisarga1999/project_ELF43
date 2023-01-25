package hotelsTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Libraries.*;

public class Hotels_001_Test extends BaseClass {
	@DataProvider()
	public String[][] data() {
		String[][] info = ReadData.multipleDataFromExcel("Nisarga", "Hotels_001_Test");
		return info;
	}

	@Test(dataProvider = "data")
	public void printLocator(String data[]) throws InterruptedException {
		homePage.getHotelsNavBar().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		String Destination = hotelPage.getDestinationLocator().getText();
		System.out.println(Destination);
		hotelPage.getDestinationTextBox().click();
		String place = data[1];
		System.out.println("place" + place);
		//hotelPage.getDestinationTextBox().clear();
		hotelPage.getDestinationTextBox().sendKeys(place);

		if (place.equalsIgnoreCase("bangalore")) {
			explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getBangaloreSugesstion()));
			hotelPage.getBangaloreSugesstion().click();
		} else if (place.equalsIgnoreCase("chennai")) {
			explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getChennaiSugesstion()));
			hotelPage.getChennaiSugesstion().click();
		} else if (place.equalsIgnoreCase("Mangalore")) {
			explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getMangaloreSugesstion()));
			hotelPage.getMangaloreSugesstion().click();
		} else if (place.equalsIgnoreCase("Mysore")) {
			explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getMysoreSugesstion()));
			hotelPage.getMysoreSugesstion().click();
		}
	}
}
