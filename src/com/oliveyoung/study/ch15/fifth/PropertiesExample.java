package com.oliveyoung.study.ch15.fifth;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	
	public static void main(String[] args) throws Exception {
		
		Properties properties  = new Properties();
		
		
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");   // decode 보단 convert 
		
		properties.load(new FileReader(path));
		// ==  FileReader fileReader = new FileReader(path);
		// properties.load(fileReader);
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
