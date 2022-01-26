package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	public static Properties pro;
	public void loadconfigfile() throws Exception {
		String configfilepath = "C:\\Users\\rautm\\eclipse-workspace\\com.Mayur\\config\\config.properties";
		File src = new File(configfilepath);
		FileInputStream configfile= new FileInputStream(src);
		pro = new Properties();
		pro.load(configfile);
	}
	public String geturl() {
		return pro.getProperty("url");
	}
	public String getemailid() {
		return pro.getProperty("emailid");
	}
	public String getpassword() {
		return pro.getProperty("password");
	}
}
