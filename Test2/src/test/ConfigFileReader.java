package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	
	public static String fileReader(String Key) throws FileNotFoundException, IOException {
	File f = new File("./ConfigurationProperties/config.properties");
	FileReader fr = new FileReader(f);
	
	Properties prop = new Properties();
	prop.load(fr);
	return prop.get(Key).toString();

	}
}
