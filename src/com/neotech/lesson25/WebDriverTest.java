package com.neotech.lesson25;

public class WebDriverTest {

	public static void main(String[] args) {

		// You cannot create an object of the interface
		// Camera c = new Camera();

		// Create a ChromeDriver object
		ChromeDriver ch = new ChromeDriver();
		ch.openBrowser();
		ch.maximizeWindow();
		ch.findElement();
		ch.takePicture();
		ch.closeBrowser();

		System.out.println("----------------");

		// Create a FirefoxDriver object
		FirefoxDriver fd = new FirefoxDriver();
		fd.openBrowser();
		fd.maximizeWindow();
		fd.findElement();
		fd.takePicture();
		fd.closeBrowser();

		System.out.println("----------------");

		// I created an object of ChromeDriver
		ChromeDriver cd = new ChromeDriver();

		// We are up-casting
		WebDriver wd = cd;

		wd.openBrowser();
		wd.maximizeWindow();
		wd.findElement();
		// wd.takePicture();
		wd.closeBrowser();

		// We are casting the object and store it as a camera
		Camera camera = (Camera) wd;
		camera.takePicture();

		System.out.println("**********************");
		// This is a real example

		String browser = "chrome";

		WebDriver driver;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.openBrowser();
		driver.findElement();
		driver.closeBrowser();

// This is how it is done without Polymorphism/Abstraction		
//		if (browser.equals("chrome")) {
//			ChromeDriver chromeDriver = new ChromeDriver();
//			chromeDriver.openBrowser();
//			chromeDriver.findElement();
//			chromeDriver.closeBrowser();
//		} else {
//			FirefoxDriver firefoxDriver = new FirefoxDriver();
//			firefoxDriver.openBrowser();
//			firefoxDriver.findElement();
//			firefoxDriver.closeBrowser();
//		}

	}

}
