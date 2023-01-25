package hotelsTestCase;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import generic_Libraries.ReadData;

public class Hotels_004_Test extends BaseClass {
	@Test
	public void checkOut() {
		/*LocalDateTime SystemDateTime = LocalDateTime.now().plusDays(3);
		String month = SystemDateTime.getMonth().name();
		int year = SystemDateTime.getYear();
		int day = SystemDateTime.getDayOfMonth();
		DayOfWeek week = SystemDateTime.getDayOfWeek();
		String monthName = ""+month.charAt(0)+month.substring(1,3).toLowerCase();
		System.out.println(week+" "+monthName+" "+day+" "+year);
		
		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		hotelPage.getCheckOutTextBox().click();
		//driver.findElement(By.xpath("(//div[@id='depart-cal']/../..//div[@data-date='"+day+"'])[1]")).submit();
		driver.findElement(By.xpath("(//div[@data-month='1']/../..//div[@data-date='"+day+"'])[2]")).submit();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));*/
		
		homePage.getHotelsNavBar().click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		int day = ReadData.dayFromSystem(7);
		String month = ReadData.monthFromSystem(0);
		System.out.println(month + " " + day);
		hotelPage.getCheckOutTextBox().click();
		for (;;) {
			try {
				WebElement calendar = driver.findElement(
						By.xpath("//span[text()='"+month+"']/../../..//div[text()='"+day+"']"));
				explicitWait.until(ExpectedConditions.elementToBeClickable(calendar));
				// calendar.click();
				action.moveToElement(calendar).doubleClick().perform();
				break;
			} catch (Exception e) {
				homePage.getRightCalenderArrowIcon().click();
			}
		}
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));

	}
}
