package packagedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class democlass {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\naresh\\eclipse-workspace\\SampleProject\\src\\main\\java\\packagedemo\\demoproperties.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\naresh\\eclipse-workspace\\SampleProject\\src\\main\\java\\packagedemo\\demoproperties.properties");
		
		prop.setProperty("browser", "firefox");
		prop.store(fos, "file");
		
		System.out.println(prop.getProperty("browser"));
		
		
		

	}

}
