package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils {

	public static String readConfig(String key) throws Exception {	

		String path = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";

		FileInputStream file = new FileInputStream(path);

		Properties prop = new Properties();
		prop.load(file);

		String propvalue = prop.getProperty(key);

		return propvalue;

	}

}

