package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
 * @author yashu*/
public class FileUtility {
	/*
	 * this method will return value from the property file 
	 * this method takes key as an argument
	 */
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
