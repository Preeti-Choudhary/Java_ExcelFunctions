import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Read_PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//extracting location of current project
		//System.out.println(System.getProperty("user.dir"));
		String ProjectLocation = System.getProperty("user.dir");
		//Creating objects to read properties file
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\Config\\Employee.Properties");
		prop.load(ip);
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("hobbies"));
		
	}

}
