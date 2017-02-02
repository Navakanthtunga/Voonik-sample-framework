package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GenericLib {
	public static String path=System.getProperty("user.dir");
	public static String configFilePath=path+"//config.properties";
	
	public static String getconfigdata(String sfile,String skey) throws Throwable
	{
		String value=null;
		Properties prop=new Properties();
		try{
			FileInputStream fio=new FileInputStream(sfile);

		prop.load(fio);
		 value=prop.getProperty(skey);}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return value;
		
	}
}
