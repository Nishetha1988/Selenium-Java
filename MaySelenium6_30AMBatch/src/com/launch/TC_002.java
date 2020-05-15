package com.launch;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launchBrowser("firefoxbrowser");
		
		navigateUrl("bestbuyurl");
	}

}
