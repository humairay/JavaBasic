package com.neotech.lesson26;

interface WebDriver {

	
	void open();
	void close();
	
	String getTitle();
	
}


interface TakeScreenshot
{
	void getScreenshot();
}


interface RemoteWebDriver extends WebDriver, TakeScreenshot
{
	void navigate();
	
	//getScreenshot(); , close();, getTitle();, open();
}

class ChromeDriver implements RemoteWebDriver
{

	@Override
	public void open() {

		System.out.println("Chrome driver opened!");		
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed!");		
	}

	@Override
	public String getTitle() {

		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {

		System.out.println("Screenshot taken in Chrome!");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to another page in Chrome!");
	}
	
}



class FirefoxDriver implements RemoteWebDriver
{

	@Override
	public void open() {
System.out.println("Firefox driver opened!");		
	}

	@Override
	public void close() {
System.out.println("Firefox driver closed!!");		
	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {
System.out.println("Screenshot taken in Firefox!");		
	}

	@Override
	public void navigate() {
System.out.println("Navigating to another page in Firefox!!");		
	}
	
}

class Homework2
{
	public static void main(String[] args) {
		
	//	RemoteWebDriver rwd = new RemoteWebDriver(); //CE
		
		ChromeDriver c = new ChromeDriver();
		c.close();
		
		FirefoxDriver f = new FirefoxDriver();
		f.open();
		
		System.out.println("UPCASTING");
		
		RemoteWebDriver rwd1 = c; //upcasting an object of ChromeDriver();
		rwd1.open();
		RemoteWebDriver rwd2 = new FirefoxDriver();
		rwd2.open();
		
		
		System.out.println("Why do we need upcasting???");
		RemoteWebDriver[] rwd_array = new RemoteWebDriver[3];
		
		
		rwd_array[0] =  c;
		rwd_array[1] = f;
		rwd_array[2] = new ChromeDriver();
		
		
	}
}


