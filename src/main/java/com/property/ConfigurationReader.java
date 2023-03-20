package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
 public static Properties p;
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\PropertyFile\\TestData.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
				
	}
	public  String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
		
		

	}
	 public String getUrl() {
		  String url = p.getProperty("url");
		  return url;
		  

	}
	 public String getUsername() {
		 String username = p.getProperty("username");
		 return username;
		 

	}
	 
	 public String getPassword() {
		 String password = p.getProperty("password");
		 return password;

	}

}
