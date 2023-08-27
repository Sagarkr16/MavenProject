package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//It is going to convert data into stream of bytes
		FileInputStream fis = new FileInputStream("./Data/commondata.properties");
		//Creating an object of properties class
		Properties pobj = new Properties();
		//Loading stream of bytes into properties object
		pobj.load(fis);
		//Retrieving data from properties object
		String url = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pw = pobj.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}

}

