package ebayTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	/*Create Method to Navigate to the following: Home, Saved, Motors..
    - Today's Deal functionality
    - Search Functionality
    - Search By Category
    - Sign In functionality
    - Advanced Search
    */
	private WebDriver driver;
	private WebElement element;
	private String homePath = "//*[@id=\"mainContent\"]/div[1]/ul/li[1]/span";
	private String savedPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a";
	private String motorsPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a";
	private String fashionPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a";
	private String electronicsPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a";
	private String collectiblesAndArtPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a";
	private String homeAndGardenPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a";
	private String sportingGoodsPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a";
	private String toysPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[13]/div[2]/a[7]";
	private String businessAndIndustrialPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[13]/div[2]/a[8]";
	private String musicPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[13]/div[2]/a[9]";
	private String ebayRefurbishedPath = "//*[@id=\"mainContent\"]/div[1]/ul/li[13]/div[2]/a[10]";
	
	private String searchBoxPath = "//*[@id=\"gh-ac\"]";
	private String searchCategoryPath = "//*[@id=\"gh-cat\"]";
	private String advancedSearchPath = "//*[@id=\"gh-as-a\"]";
	
	public void home() {
		driver.findElement(By.xpath(homePath)).click();
	}
	public void saved() {
		driver.findElement(By.xpath(savedPath)).click();
	}
	public void motors() {
		driver.findElement(By.xpath(motorsPath)).click();
	}
	public void fashion() {
		driver.findElement(By.xpath(fashionPath)).click();
	}
	public void electronics() {
		driver.findElement(By.xpath(electronicsPath)).click();
	}
	public void collectiblesAndArt() {
		driver.findElement(By.xpath(collectiblesAndArtPath)).click();
	}
	public void homeAndGarden() {
		driver.findElement(By.xpath(homeAndGardenPath)).click();
	}
	public void sportingGoods() {
		driver.findElement(By.xpath(sportingGoodsPath)).click();
	}
	public void toys() {
		driver.findElement(By.xpath(toysPath)).click();
	}
	public void businessAndIndustrial() {
		driver.findElement(By.xpath(businessAndIndustrialPath)).click();
	}
	public void music() {
		driver.findElement(By.xpath(musicPath)).click();
	}
	public void ebayRefurbished() {
		driver.findElement(By.xpath(ebayRefurbishedPath)).click();
	}
	public void search(String searchTerm) {
		WebElement search = driver.findElement(By.xpath(searchBoxPath));
		search.sendKeys(searchTerm);
		//search.submit();
	}
	public void searchCategory() {
		driver.findElement(By.xpath(searchCategoryPath)).click();
	}
	public void advancedSearch() {
		driver.findElement(By.xpath(advancedSearchPath)).click();
	}
	public void submit() {
		element.submit();
	}
}
