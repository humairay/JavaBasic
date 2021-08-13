package com.neotech.lesson23;

public class WebDriver {

	public void open()
	{
		System.out.println("Open Browser");
	}
}

class ChromeDriver extends WebDriver
{
	public void open()
	{
		System.out.println("Open Chrome Browser");
	}
}

class FirefoxDriver extends WebDriver
{
	public void open()
	{
		System.out.println("Open Firefox Browser");
	}
}


class InternetExplorerDriver extends WebDriver
{
	
	public void open()
	{
		System.out.println("Open Internet Explorer Browser (at your own risk) ");
	}
}









