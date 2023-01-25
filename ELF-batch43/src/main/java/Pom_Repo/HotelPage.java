package Pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {
	public HotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[.='DESTINATION']")
	private WebElement destinationLocator;

	public WebElement getDestinationTextBox() {
		return destinationTextBox;
	}

	@FindBy(xpath = "//div[text()='Select Destination']")
	private WebElement destinatiomErrorMes;

	public WebElement getDestinatiomErrorMes() {
		return destinatiomErrorMes;
	}

	public WebElement getForwardArrow() {
		return forwardArrow;
	}

	public WebElement getBackWardArrow() {
		return backWardArrow;
	}

	public WebElement getCancelIcon() {
		return cancelIcon;
	}

	public WebElement getRoomesAndGuestsTextBox() {
		return RoomesAndGuestsTextBox;
	}

	public WebElement getroomGuestDropDown() {
		return roomGuestdropDown;
	}

	public WebElement getMinus1() {
		return minus1;
	}

	public WebElement getMinus2() {
		return minus2;
	}

	public WebElement getPlus1() {
		return plus1;
	}

	public WebElement getAddRoom() {
		return addRoom;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getCancelIconForRoomAndGuester() {
		return cancelIconForRoomAndGuester;
	}

	public WebElement getNationalityTextBox() {
		return nationalityTextBox;
	}

	public WebElement getResidenceTExtBox() {
		return residenceTExtBox;
	}

	public WebElement getIsolationCheckBox() {
		return isolationCheckBox;
	}

	public WebElement getSearchHotelButton() {
		return searchHotelButton;
	}

	public WebElement getDestinationLocator() {
		return destinationLocator;
	}

	@FindBy(id = "destination")
	private WebElement destinationTextBox;

	@FindBy(xpath = "(//span[@class='searchName'])[1]")
	private WebElement searchDestination;

	@FindBy(xpath = "//span[contains(text(),'Bangalore')]/../..")
	private WebElement BangaloreSugesstion;
	@FindBy(xpath = "//span[contains(text(),'Chennai')]")
	private WebElement ChennaiSugesstion;
	@FindBy(xpath = "//span[contains(text(),'Mangalore')]")
	private WebElement MangaloreSugesstion;
	@FindBy(xpath = "//span[contains(text(),'Mysore')]")
	private WebElement MysoreSugesstion;

	public WebElement getBangaloreSugesstion() {
		return BangaloreSugesstion;
	}

	public WebElement getChennaiSugesstion() {
		return ChennaiSugesstion;
	}

	public WebElement getMangaloreSugesstion() {
		return MangaloreSugesstion;
	}

	public WebElement getMysoreSugesstion() {
		return MysoreSugesstion;
	}

	public WebElement getSearchDestination() {
		return searchDestination;
	}

	@FindBy(xpath = "//label[text()='CHECK IN']")
	private WebElement checkInLocator;
	@FindBy(xpath = "//label[text()='CHECK OUT']")
	private WebElement checkOutLocator;
	@FindBy(xpath = "//label[text()='ROOMS AND GUESTS']")
	private WebElement roomAndGuestLocator;
	@FindBy(xpath = "//label[text()='Nationality']")
	private WebElement nationalityLocator;
	@FindBy(xpath = "//label[text()='Residence']")
	private WebElement residenceLocator;

	public WebElement getCheckInLocator() {
		return checkInLocator;
	}

	public WebElement getCheckOutLocator() {
		return checkOutLocator;
	}

	public WebElement getRoomAndGuestLocator() {
		return roomAndGuestLocator;
	}

	public WebElement getNationalityLocator() {
		return nationalityLocator;
	}

	public WebElement getResidenceLocator() {
		return residenceLocator;
	}

	@FindBy(id = "checkIn")
	private WebElement checkinTextBox;

	public WebElement getCheckinTextBox() {
		return checkinTextBox;
	}

	@FindBy(id = "checkOut")
	private WebElement checkOutTextBox;

	public WebElement getCheckOutTextBox() {
		return checkOutTextBox;
	}

	@FindBy(xpath = "(//span[contains(@class,'icon-Rightarrowthin')])[2]")
	private WebElement forwardArrow;
	@FindBy(xpath = "(//span[contains(@class,'icon-leftarrowthin')])[1]")
	private WebElement backWardArrow;
	@FindBy(id = "vc-close")
	private WebElement cancelIcon;
	@FindBy(xpath = "//div[@class='hotelRoomDropDown  js-room'])")
	private WebElement RoomesAndGuestsTextBox;
	@FindBy(xpath = "//span[@class='drop-icon']")
	private WebElement roomGuestdropDown;
	@FindBy(xpath = "(//div[@class='minus'])[1]")
	private WebElement minus1;
	@FindBy(xpath = "(//div[@class='minus'])[2]")
	private WebElement minus2;
	@FindBy(xpath = "(//div[@class='plus'])[1]")
	private WebElement plus1;
	@FindBy(xpath = "(//div[@class='plus'])[2]")
	private WebElement plus2;

	@FindBy(xpath = "(//div[@class='childAge']/../..//select)[1]")
	private WebElement childAge1;

	public WebElement getChildAge() {
		return childAge1;
	}
	@FindBy(xpath = "(//div[@class='childAge']/../..//select)[2]")private WebElement childAge2;
	@FindBy(xpath = "(//div[@class='childAge']/../..//select)[3]")private WebElement chidAge3;

	public WebElement getChildAge1() {
		return childAge1;
	}

	public WebElement getChildAge2() {
		return childAge2;
	}

	public WebElement getChidAge3() {
		return chidAge3;
	}

	@FindBy(xpath = "//div[contains(text(),'Add Rooms')]")
	private WebElement addRoom;

	public WebElement getRoomGuestdropDown() {
		return roomGuestdropDown;
	}

	public WebElement getPlus2() {
		return plus2;
	}

	@FindBy(xpath = "//div[text()='Cancel']")
	private WebElement cancelButton;
	@FindBy(xpath = "//div[text()='Done!']")
	private WebElement doneButton;
	@FindBy(xpath = "//div[@class='close']")
	private WebElement cancelIconForRoomAndGuester;
	@FindBy(id = "nationalityCountry")
	private WebElement nationalityTextBox;
	@FindBy(id = "residenceCountry")
	private WebElement residenceTExtBox;
	@FindBy(xpath = "//div[@class='customCBox']")
	private WebElement isolationCheckBox;
	@FindBy(xpath = "//div[contains(text(),'Search Hotels')]")
	private WebElement searchHotelButton;
}
