package hotelsTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Libraries.*;

public class Hotels_005_Test extends BaseClass{
	
	@DataProvider()
	public String[][] data() {
		String[][] info = ReadData.multipleDataFromExcel("Nisarga", "Hotels_005_Test");
		return info;
	}
	@Test(dataProvider = "data")
	public void guestRoomSelect(String data[]){
		homePage.getHotelsNavBar().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		hotelPage.getroomGuestDropDown().click();
		explicitWait.until(ExpectedConditions.visibilityOf(hotelPage.getDoneButton()));
		String numberOfadults = data[1];
		int adults = Integer.parseInt(numberOfadults);
		System.out.println(adults);
		for(int i=2;i<adults;i++) {
			hotelPage.getPlus1().click();
		}
		String numberOfChildren = data[2];
		int children = Integer.parseInt(numberOfChildren);
		System.out.println(children);
		for(int i=1;i<=children;i++) {
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
			
			//child 2
			String childage2 = "5";
			System.out.println(childage2);
			Select select2 = new Select(hotelPage.getChildAge2());
			select2.selectByValue(childage2);
			hotelPage.getDoneButton().click();
		}else if(children==3) {
			//child 1
			String childage = "3";
			System.out.println(childage);
			Select select1 = new Select(hotelPage.getChildAge1());
			select1.selectByValue(childage);
			
			//child 2
			String childage2 = "5";
			System.out.println(childage2);
			Select select2 = new Select(hotelPage.getChildAge2());
			select2.selectByValue(childage2);
			
			//child 3
			String childage3 = "8";
			System.out.println(childage3);
			Select select3 = new Select(hotelPage.getChidAge3());
			select3.selectByValue(childage3);
			hotelPage.getDoneButton().click();
		}
	}
}
