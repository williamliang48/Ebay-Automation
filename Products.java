package ebayTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products extends Base {
/**
	Functionalities and Methods:
        - Inherit All Methods from Base Class (Header, Footer, Search, etc.)
        - All Listings, AcceptOffers, Auction, BuyIt Now, etc,
        - Price, Type Functionality
        - Check Product Price, Check Product Description, etc.
        - Buy It Now functionality
        */
	
	private String viewAllListingsPath = "//*[@id=\"s0-14-11-5-2[1]\"]/div[2]/div[1]/div/ul/li[1]/span";
	private String viewAcceptsOffersPath = "//*[@id=\"s0-14-11-5-2[1]\"]/div[2]/div[1]/div/ul/li[2]/a/span";
	private String viewAuctionPath = "//*[@id=\"s0-14-11-5-2[1]\"]/div[2]/div[1]/div/ul/li[3]/a/span";
	private String viewBuyItNowPath = "//*[@id=\"s0-14-11-5-2[1]\"]/div[2]/div[1]/div/ul/li[4]/a/span";
	
	private String conditionMenuPath = "//*[@id=\"nid-E1H-4\"]/button";
	private String conditionAllPath = "//*[@id=\"s0-14-11-5-2[1]-55[1]-11-content-menu\"]/li[1]/a/span";
	private String conditionNewPath = "//*[@id=\"s0-14-11-5-2[1]-55[1]-11-content-menu\"]/li[2]/a/span";
	private String conditionUsedPath = "//*[@id=\"s0-14-11-5-2[1]-55[1]-11-content-menu\"]/li[3]/a/span";
	private String conditionNotSpecifiedPath = "//*[@id=\"s0-14-11-5-2[1]-55[1]-11-content-menu\"]/li[4]/a";
	
	private String shippingMenuPath = "//*[@id=\"nid-Gdm-3\"]/button";
	private String freeShippingPath = "//*[@id=\"s0-14-11-5-2[1]-55[2]-11-content-menu\"]/li/a/span/span/input";
	
	private String priceFilterOption1Path = "//*[@id=\"s0-14-11-0-1-2-6-0-6[3]\"]/li[1]/div/a/div/div/span[1]";
	private String priceFilterOption2Path = "//*[@id=\"s0-14-11-0-1-2-6-0-6[3]\"]/li[2]/div/a/div/div/span[1]";
	private String priceFilterOption3Path = "//*[@id=\"s0-14-11-0-1-2-6-0-6[3]\"]/li[3]/div/a/div/div/span[1]";
	private String priceFilterMinPath = "//*[@id=\"s0-14-11-0-1-2-6-0-6[3]-0-textrange-beginParamValue-textbox\"]";
	private String priceFilterMaxPath = "//*[@id=\"s0-14-11-0-1-2-6-0-6[3]-0-textrange-endParamValue-textbox\"]";
	private String priceFilterSubmitPath = "//*[@id=\"s0-14-11-0-1-2-6-0-6[3]-0-textrange\"]/div/div[3]/button";
	
	/**
	private String resultsXPathStart = "//*[@id=\"srp-river-results\"]/ul/li[";
	//insert int result number between resultsXPathStart and resultsXPathEnd
	private String resultsXPathEnd = "]/div/div[2]/a/h3";
	private String resultsPriceXpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[2]/div[1]/span";
	*/

	public void viewAllListings() {
		WebElement element = driver.findElement(By.xpath(viewAllListingsPath));
		if (!element.isSelected()) element.click();
	}
	public void viewAcceptsOffers() {
		WebElement element = driver.findElement(By.xpath(viewAcceptsOffersPath));
		if (!element.isSelected()) element.click();
	}
	public void viewAuction() {
		WebElement element = driver.findElement(By.xpath(viewAuctionPath));
		if (!element.isSelected()) element.click();
	}
	public void viewBuyItNow() {
		WebElement element = driver.findElement(By.xpath(viewBuyItNowPath));
		if (!element.isSelected()) element.click();
	}
	public void conditionMenu() {
		driver.findElement(By.xpath(conditionMenuPath)).click();
	}
	public void conditionAll() {
		conditionMenu();
		WebElement element = driver.findElement(By.xpath(conditionAllPath));
		if (!element.isSelected()) element.click();
	}
	public void conditionNew() {
		conditionMenu();
		WebElement element = driver.findElement(By.xpath(conditionNewPath));
		if (!element.isSelected()) element.click();
	}
	public void conditionUsed() {
		conditionMenu();
		WebElement element = driver.findElement(By.xpath(conditionUsedPath));
		if (!element.isSelected()) element.click();
	}
	public void conditionNotSpecified() {
		conditionMenu();
		WebElement element = driver.findElement(By.xpath(conditionNotSpecifiedPath));
		if (!element.isSelected()) element.click();
	}
	public void freeShipping() {
		driver.findElement(By.xpath(shippingMenuPath)).click();
		WebElement element = driver.findElement(By.xpath(freeShippingPath));
		if (!element.isSelected()) element.click();
	}
	public void priceFilterOption1() {
		WebElement element = driver.findElement(By.xpath(priceFilterOption1Path));
		if (!element.isSelected()) element.click();
	}
	public void priceFilterOption2() {
		WebElement element = driver.findElement(By.xpath(priceFilterOption2Path));
		if (!element.isSelected()) element.click();
	}
	public void priceFilterOption3() {
		WebElement element = driver.findElement(By.xpath(priceFilterOption3Path));
		if (!element.isSelected()) element.click();
	}
	public void priceFilterMin(String price) {
		driver.findElement(By.xpath(priceFilterMinPath)).sendKeys(price);
	}
	public void priceFilterMax(String price) {
		driver.findElement(By.xpath(priceFilterMaxPath)).sendKeys(price);
	}
	public void priceFilterSubmit() {
		driver.findElement(By.xpath(priceFilterSubmitPath)).click();
	}
}

