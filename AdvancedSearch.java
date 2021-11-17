package ebayTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearch {

	/**         - Functionalities and Methods:
             - Items and Stores: Left Hand Rail
             - FindItems By keyword
             - Search Including
             - Price
             - etc.
             - Sort By, View Results, Results per page, Clear Options
     */
	private WebDriver driver;
	
	private String findItemsPath = "//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[1]/a";
	private String onEbayMotorsPath = "//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[2]/a";
	private String bySellerPath = "//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a";
	private String byItemNumberPath = "//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[4]/a";
	private String itemsInStorePath = "//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[1]/a";
	private String findStoresPath = "//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[2]/a";
	
	private String searchKeywordPath = "//*[@id=\"_nkw\"]";
	private String searchExcludePath = "//*[@id=\"_ex_kw\"]";
	
	private String titleAndDescriptionPath = "//*[@id=\"LH_TitleDesc\"]";
	private String completedListingsPath = "//*[@id=\"LH_Complete\"]";
	private String soldListingsPath = "//*[@id=\"LH_Sold\"]";
	
	private String priceCheckboxPath = "//*[@id=\"_mPrRngCbx\"]";
	private String priceMinPath = "//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]";
	private String priceMaxPath = "//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]";
	
	private String sortByTimeEndingSoonestPath = "//*[@id=\"LH_SORT_BY\"]/option[1]";
	private String sortByTimeNewlyListedPath = "//*[@id=\"LH_SORT_BY\"]/option[2]";
	private String sortByPriceAndShippingLowestPriceFirstPath = "//*[@id=\"LH_SORT_BY\"]/option[3]";
	private String sortByPriceAndShippingHighestPriceFirstPath = "//*[@id=\"LH_SORT_BY\"]/option[4]";
	private String sortByDistanceNearestFirstPath = "//*[@id=\"LH_SORT_BY\"]/option[5]";
	private String sortByBestMatchPath = "//*[@id=\"LH_SORT_BY\"]/option[6]";
	
	private String viewResultsAllItemsPath = "//*[@id=\"LH_VIEW_RESULTS_AS\"]/option[1]";
	private String viewResultsPictureGalleryPath = "//*[@id=\"LH_VIEW_RESULTS_AS\"]/option[2]";
	private String viewResultsShowItemNumbersPath = "//*[@id=\"LH_VIEW_RESULTS_AS\"]/option[3]";
	
	private String resultsPerPage25Path = "//*[@id=\"LH_IPP\"]/option[1]";
	private String resultsPerPage50Path = "//*[@id=\"LH_IPP\"]/option[2]";
	private String resultsPerPage100Path = "//*[@id=\"LH_IPP\"]/option[3]";
	private String resultsPerPage200Path = "//*[@id=\"LH_IPP\"]/option[4]";
	
	private String searchSubmitPath = "//*[@id=\"searchBtnLowerLnk\"]";
	
	public void findItems() {
		driver.findElement(By.xpath(findItemsPath)).click();
	}
	public void onEbayMotors() {
		driver.findElement(By.xpath(onEbayMotorsPath)).click();
	}
	public void bySeller() {
		driver.findElement(By.xpath(bySellerPath)).click();
	}
	public void byItemNumber() {
		driver.findElement(By.xpath(byItemNumberPath)).click();
	}
	public void itemsInStore() {
		driver.findElement(By.xpath(itemsInStorePath)).click();
	}
	public void findStores() {
		driver.findElement(By.xpath(findStoresPath)).click();
	}
	public void searchKeyword(String keyword) {
		driver.findElement(By.xpath(searchKeywordPath)).sendKeys(keyword);
	}
	public void searchExclude(String keyword) {
		driver.findElement(By.xpath(searchExcludePath)).sendKeys(keyword);
	}
	public void searchIncludingTitleAndDescription() {
		driver.findElement(By.xpath(titleAndDescriptionPath)).click();
	}
	public void searchIncludingCompletedListings() {
		driver.findElement(By.xpath(completedListingsPath)).click();
	}
	public void searchIncludingSoldListings() {
		driver.findElement(By.xpath(soldListingsPath)).click();
	}
	public void checkPriceBox() {
		driver.findElement(By.xpath(priceCheckboxPath)).click();
	}
	public void setPriceMin(String minPrice) {
		driver.findElement(By.xpath(priceMinPath)).sendKeys(minPrice);
	}
	public void setPriceMax(String maxPrice) {
		driver.findElement(By.xpath(priceMaxPath)).sendKeys(maxPrice);
	}
	public void sortByTimeEndingSoonest() {
		driver.findElement(By.xpath(sortByTimeEndingSoonestPath)).click();
	}
	public void sortByTimeNewlyListed() {
		driver.findElement(By.xpath(sortByTimeNewlyListedPath)).click();
	}
	public void sortByPriceAndShippingLowestFirst() {
		driver.findElement(By.xpath(sortByPriceAndShippingLowestPriceFirstPath)).click();
	}
	public void sortByPriceAndShippingHighestFirst() {
		driver.findElement(By.xpath(sortByPriceAndShippingHighestPriceFirstPath)).click();
	}
	public void sortByDistanceNearestFirst() {
		driver.findElement(By.xpath(sortByDistanceNearestFirstPath)).click();
	}
	public void sortByBestMatch() {
		driver.findElement(By.xpath(sortByBestMatchPath)).click();
	}
	public void viewResultsAllItems() {
		driver.findElement(By.xpath(viewResultsAllItemsPath)).click();
	}
	public void viewResultsPictureGallery() {
		driver.findElement(By.xpath(viewResultsPictureGalleryPath)).click();
	}
	public void viewResultsShowItemNumbers() {
		driver.findElement(By.xpath(viewResultsShowItemNumbersPath)).click();
	}
	public void resultsPerPage25() {
		driver.findElement(By.xpath(resultsPerPage25Path)).click();
	}
	public void resultsPerPage50() {
		driver.findElement(By.xpath(resultsPerPage50Path)).click();
	}
	public void resultsPerPage100() {
		driver.findElement(By.xpath(resultsPerPage100Path)).click();
	}
	public void resultsPerPage200() {
		driver.findElement(By.xpath(resultsPerPage200Path)).click();
	}
	public void searchSubmit() {
		driver.findElement(By.xpath(searchSubmitPath)).click();
	}
}
