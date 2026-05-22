package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class ScreenshotUtils extends BaseClass {
	
	public static String GettheScreenshot(String name) throws Exception {
		
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot tsc = (TakesScreenshot)driver;
		File source=tsc.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"//ScreenShots//"+name+"_"+timestamp+".png";
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		return path;
	}
}
