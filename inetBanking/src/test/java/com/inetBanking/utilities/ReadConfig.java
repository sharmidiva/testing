package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	//It will fetch from config.properties
	
	Properties pro;
	public ReadConfig() {//constructor
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println("Exception is =="+e.getMessage());
			
		}//catch
	}//method
	public String getURL() {
		String url=pro.getProperty("baseURL");//baseURL,user name,password is coming from config.properties
		return url;
	}
	public String getUname() {
		String username=pro.getProperty("username");
		return username;
		
	}
	public String getPwd() {
		String password=pro.getProperty("password");
		return password;
	}
	

}
