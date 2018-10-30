package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	Properties properties;
	public PropertyFileReader(String Filepath) {
		try {
			FileInputStream Locator = new FileInputStream(Filepath);
			properties =new Properties();
			properties.load(Locator);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getData(String ElementName) throws Exception{
		//read value using the logical name as key
		String data =properties.getProperty()
	}
}
