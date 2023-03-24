package hotelsTestCase;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Libraries.*;

public class Hotels_10_Test extends BaseClass {
	@DataProvider()
	public String[][] data() {
		String[][] info = ReadData.multipleDataFromExcel("Nisarga", "Hotels_10_Test");
		return info;
	}

	@Test(dataProvider = "data", groups = "Functionality")
	public void searchHotel(String data[]) throws InterruptedException {
		homePage.getHotelsNavBar().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));

		//// destination
		String Destination = hotelPage.getDestinationLocator().getText();
		System.out.println(Destination);
		String place = data[1];
		System.out.println("place" + place);
		hotelPage.getDestinationTextBox().clear();
		hotelPage.getDestinationTextBox().sendKeys(place);
		if (place.equalsIgnoreCase("bangalore")) {
			hotelPage.getBangaloreSugesstion().click();
		} else if (place.equalsIgnoreCase("chennai")) {
			hotelPage.getChennaiSugesstion().click();
		} else if (place.equalsIgnoreCase("chennai")) {
			hotelPage.getMangaloreSugesstion().click();
		} else if (place.equalsIgnoreCase("chennai")) {
			hotelPage.getMysoreSugesstion().click();
		}

		// checkin
		String checkIndate = data[2];
		int checkInDay = ReadData.readDayFromExcel(checkIndate);
		String checkInMonth = ReadData.readMonthFromExcel(checkIndate);
		System.out.println(checkInMonth + " " + checkInDay);
		hotelPage.getCheckinTextBox().click();
		for (;;) {
			try {
				WebElement calendar = driver
						.findElement(By.xpath("//span[text()='" + checkInMonth + "']/../../..//div[text()='" + checkInDay + "']"));
				explicitWait.until(ExpectedConditions.elementToBeClickable(calendar));
				// calendar.click();
				action.moveToElement(calendar).doubleClick().perform();
				break;
			} catch (Exception e) {
				homePage.getRightCalenderArrowIcon().click();
			}
		}
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));

		// checkOut
		String checkOutdate = data[3];
		int day = ReadData.readDayFromExcel(checkOutdate);
		String month = ReadData.readMonthFromExcel(checkOutdate);
		System.out.println(month + " " + day);
		hotelPage.getCheckOutTextBox().click();
		for (;;) {
			try {
				WebElement calendar = driver.findElement(
						By.xpath("(//span[text()='" + month + "']/../../..//div[text()='" + day + "'])[2]"));
				explicitWait.until(ExpectedConditions.elementToBeClickable(calendar));
				// calendar.click();
				action.moveToElement(calendar).doubleClick().perform();
				break;
			} catch (Exception e) {
				homePage.getRightCalenderArrowIcon().click();
			}
		}
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		// select guest room
		// explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		hotelPage.getroomGuestDropDown().click();
		explicitWait.until(ExpectedConditions.visibilityOf(hotelPage.getDoneButton()));
		String numberOfadults = data[4];
		int adults = Integer.parseInt(numberOfadults);
		System.out.println(adults);
		for (int j = 2; j < adults; j++) {
			hotelPage.getPlus1().click();
		}
		String numberOfChildren = data[5];
		int children = Integer.parseInt(numberOfChildren);
		System.out.println(children);
		for (int i = 1; i <= children; i++) {
			hotelPage.getPlus2().click();
		}
		if (children == 1) {
			String childage = "8";
			System.out.println(childage);
			Select select = new Select(hotelPage.getChildAge1());
			select.selectByValue(childage);
			hotelPage.getDoneButton().click();
		} else if (children == 2) {
			String childage = "3";
			System.out.println(childage);
			Select select1 = new Select(hotelPage.getChildAge1());
			select1.selectByValue(childage);

			// child 2
			String childage2 = "5";
			System.out.println(childage2);
			Select select2 = new Select(hotelPage.getChildAge2());
			select2.selectByValue(childage2);
			hotelPage.getDoneButton().click();
		} else if (children == 3) {
			// child 1
			String childage = "3";
			System.out.println(childage);
			Select select1 = new Select(hotelPage.getChildAge1());
			select1.selectByValue(childage);

			// child 2
			String childage2 = "5";
			System.out.println(childage2);
			Select select2 = new Select(hotelPage.getChildAge2());
			select2.selectByValue(childage2);

			// child 3
			String childage3 = "8";
			System.out.println(childage3);
			Select select3 = new Select(hotelPage.getChidAge3());
			select3.selectByValue(childage3);
			hotelPage.getDoneButton().click();
		}
		// nationality
		String nation = data[6];
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		hotelPage.getNationalityTextBox().click();
		Select select1 = new Select(hotelPage.getNationalityTextBox());
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		driver.findElement(By.xpath("//select[@id='nationalityCountry']/../..//option[text()='" + nation + "']"))
				.click();
		// Thread.sleep(2000);
		// residency
		String residency = data[7];
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		hotelPage.getResidenceTExtBox().click();
		Select select2 = new Select(hotelPage.getResidenceTExtBox());
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		driver.findElement(By.xpath("//select[@id='residenceCountry']/../..//option[text()='" + residency + "']"))
				.click();

// searchButton
		hotelPage.getIsolationCheckBox().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		hotelPage.getSearchHotelButton().click();
	}
}