package hotelsTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Libraries.*;

public class Hotels_007_Test extends BaseClass{
	@DataProvider()
	public String[][] data() {
		String[][] info = ReadData.multipleDataFromExcel("Nisarga", "Hotels_007_Test");
		return info;
	}
	@Test(dataProvider = "data",groups = "Funtionality")
	public void residenceSelect(String data[]) throws InterruptedException {
		
		homePage.getHotelsNavBar().click();
		String residence =data[1];
		Select select=new Select(hotelPage.getResidenceTExtBox());
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		driver.findElement(By.xpath("//select[@id='residenceCountry']/../..//option[text()='"+residence+"']")).click();
		//explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
	}
}
