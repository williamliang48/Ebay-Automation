package ebayTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	
	protected WebDriver driver;
	
	private String signInPath = "//*[@id=\"gh-ug\"]/a";
	private String registerPath = "//*[@id=\"gh-ug-flex\"]/a";
	private String dailyDealsPath = "//*[@id=\"gh-p-1\"]/a";
	private String brandOutletPath = "//*[@id=\"gh-p-4\"]/a";
	private String helpAndContactPath =	"//*[@id=\"gh-p-3\"]/a";
	private String sellPath = "//*[@id=\"gh-p-2\"]/a";
	private String watchlistPath = "//*[@id=\"gh-wl-click\"]/div/a[1]"; 
	private String myEbayPath =	"//*[@id=\"gh-eb-My\"]/div/a[1]";
	private String notificationPath = "//*[@id=\"gh-Alerts-i\"]";
	private String cartPath	= "//*[@id=\"gh-minicart-hover\"]/div/a[1]";
	
	private String aboutEbayPath = "//*[@id=\"gf-l\"]/li[1]/a";
	private String announcementsPath = "//*[@id=\"gf-l\"]/li[2]/a";
	private String communityPath = "//*[@id=\"gf-l\"]/li[3]/a";
	private String searchBoxPath = "//*[@id=\"gh-ac\"]";
	private String homePage;
	
	public void launchPageChrome(String url) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Darren\\Desktop\\selenium-java-4.0.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void signIn() {
		driver.findElement(By.xpath(signInPath)).click();
	}
	
	public void register() {
		driver.findElement(By.xpath(registerPath)).click();
	}
	
	public void dailyDeals() {
		driver.findElement(By.xpath(dailyDealsPath)).click();
	}
	
	public void brandOutlet() {
		driver.findElement(By.xpath(brandOutletPath)).click();
	}
	
	public void helpAndContact() {
		driver.findElement(By.xpath(helpAndContactPath)).click();
	}
	
	public void sell() {
		driver.findElement(By.xpath(sellPath)).click();
	}
	
	public void watchList() {
		driver.findElement(By.xpath(watchlistPath)).click();
	}
	
	public void cart() {
		driver.findElement(By.xpath(cartPath)).click();
	}
	
	public void myEbay() {
		driver.findElement(By.xpath(myEbayPath)).click();
	}
	
	public void notificationCart() {
		driver.findElement(By.xpath(notificationPath)).click();
	}
	
	public void aboutEbay() {
		WebElement aboutEbay = driver.findElement(By.xpath(aboutEbayPath));
		driver.get(aboutEbay.getAttribute("href"));
	}
	
	public void announcements() {
		WebElement announcements = driver.findElement(By.xpath(announcementsPath));
		driver.get(announcements.getAttribute("href"));
	}
	
	public void community() {
		WebElement community = driver.findElement(By.xpath(communityPath));
		driver.get(community.getAttribute("href"));
	}

	public void quit() {
		driver.quit();
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public void search(String searchTerm) {
		WebElement search = driver.findElement(By.xpath(searchBoxPath));
		search.clear();
		search.sendKeys(searchTerm);
		search.submit();
	}
}
