package com.base;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.utilities.PropertyUtils;

public class BaseClass {

	public static WebDriver driver = null;
	public static ExtentSparkReporter sparkreporter = null;
	public static ExtentReports report = null;
	public static ExtentTest test = null;
	public static Logger logger =LogManager.getLogger(BaseClass.class);

	public  static void SetUp() throws Exception {

		String browser = PropertyUtils.readConfig("Browser");

		logger.info("initilising browser");
		if(browser.equalsIgnoreCase("chrome")) {

//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudhir\\Desktop\\geckodriver-v0.33.0-win32\\chromedriver_win32 (1)\\chromedriver.exe");
			logger.info("invoing chrome");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			logger.info("invoing firefox");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			logger.info("invoing edge");
			driver = new EdgeDriver();
		}

		driver.get( PropertyUtils.readConfig("url"));
		driver.manage().window().maximize();

	}

	public static void ReportUtils() {

		sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\target\\report.html");
		sparkreporter.config().setDocumentTitle("Automation Testing");
		sparkreporter.config().setReportName("Fuctional Test Cases");
		sparkreporter.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.attachReporter(sparkreporter);
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Testername", "Sudhir");
		report.setSystemInfo("Operating system","Windows");

	}

	public static String randomStringGenerator(int stringlength) {

		String randomString = RandomStringUtils.randomAlphabetic(stringlength);
		return randomString;
	}

	public static String randomNumberGenerator(int numberlength) {

		String randomNum = RandomStringUtils.randomNumeric(numberlength);
		return randomNum;

	}

	public static String randomAlphaNumGenerator(int numberlength) {

		String alphNum = randomStringGenerator(numberlength/2)+"@"+randomNumberGenerator(numberlength/2);
		return alphNum;

	}

	public static void main(String[] args) {

		String s1="  ";
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
	}

}
