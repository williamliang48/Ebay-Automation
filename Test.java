package ebayTesting;

import static org.junit.Assert.*;

public class Test {

	Products a = new Products(); 
		
	/**
	@org.junit.Test
	public void test1() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.signIn();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test2() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.register();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test3() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.search("wifi router");
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test4() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.dailyDeals();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test5() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.brandOutlet();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test6() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.helpAndContact();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test7() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.sell();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test8() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.watchList();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test9() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.cart();
		Thread.sleep(2000);
		a.quit();
	}

	@org.junit.Test
	public void test10() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.myEbay();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test11() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.notificationCart();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test12() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.aboutEbay();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test13() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.announcements();
		Thread.sleep(2000);
		a.quit();
	}
	
	@org.junit.Test
	public void test14() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.community();
		Thread.sleep(2000);
		a.quit();
	}
	
	*/
	@org.junit.Test
	public void test15() throws Exception {
		a.launchPageChrome("http://ebay.com");
		a.search("wifi router");
		Thread.sleep(1500);
		a.viewAllListings();
		Thread.sleep(1500);
		a.viewAcceptsOffers();
		Thread.sleep(1500);
		a.viewAuction();
		Thread.sleep(1500);
		a.viewBuyItNow();
		Thread.sleep(1500);
		a.conditionAll();
		Thread.sleep(1500);
		a.conditionNew();
		Thread.sleep(1500);
		a.conditionUsed();
		Thread.sleep(1500);
		a.conditionNotSpecified();
		Thread.sleep(1500);
		a.freeShipping();
		Thread.sleep(1500);
		a.priceFilterOption1();
		Thread.sleep(1500);
		a.priceFilterOption2();
		Thread.sleep(1500);
		a.priceFilterOption3();
		Thread.sleep(1500);
		a.priceFilterMin("20");
		Thread.sleep(1500);
		a.priceFilterMax("120");
		Thread.sleep(1500);
		a.priceFilterSubmit();
		Thread.sleep(2000);
		a.quit();
	}
}
