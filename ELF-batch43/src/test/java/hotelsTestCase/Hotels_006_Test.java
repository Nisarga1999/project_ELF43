package hotelsTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Libraries.*;

public class Hotels_006_Test extends BaseClass{
	@DataProvider()
	public String[][] data() {
		String[][] info = ReadData.multipleDataFromExcel("Nisarga", "Hotels_006_Test");
		return info;
	}
	@Test(dataProvider = "data")
	public void natinalitySelect(String data[]) throws InterruptedException {
		homePage.getHotelsNavBar().click();
		String nationality =data[1];
		Select select=new Select(hotelPage.getNationalityTextBox());
		explicitWait.until(ExpectedConditions.elementToBeClickable(hotelPage.getSearchHotelButton()));
		driver.findElement(By.xpath("//select[@id='nationalityCountry']/../..//option[text()='"+nationality+"']")).click();
		//select.selectByValue(nationality);
	}
}
