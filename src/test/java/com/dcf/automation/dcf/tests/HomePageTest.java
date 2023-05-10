package com.dcf.automation.dcf.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dcf.constatnts.AppConstant;
import com.dcf.pages.HomePage;

import comb.qa.dcf.base.BaseTest;

public class HomePageTest extends BaseTest {

	@Test
	public void homePageTitleTest() {

		String actTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actTitle,AppConstant.HOME_PAGE_TITLE);

	}
	
	@Test
	public void homePageUrlTest() {
		
		String actUrl = homePage.getHomePageUrl();
		Assert.assertEquals(actUrl.contains("home"), true);

	}
	
	@Test
	public void openAccountButtonExist() {
		
		Assert.assertEquals(homePage.openAccountExist(),true);
	}
	
	
	@Test
	public void clickOpenAccount() {
		homePage.openAccountClick();
		
	}
}
