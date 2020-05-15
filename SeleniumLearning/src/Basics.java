import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static String ProjectPath= System.getProperty("user.dir");
	public static Properties p;
	public static Properties env;
	
	
	public static void init() throws Exception {
		
		//opening env prop file and receiving env value
		fis=new FileInputStream(ProjectPath+"/environment.properties");
		p=new Properties();
		p.load(fis);
		String val = p.getProperty("env");
		System.out.println(val);
		
		//opening data.properties and loading file
		fis=new FileInputStream(ProjectPath+"/"+val+".properties");
		env=new Properties();
		env.load(fis);
		
		
	}
	
	public static void LaunchBrowser(String name) {
		if(env.getProperty(name).equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ProjectPath+"/drivers/chromedriver");
			driver = new ChromeDriver();
		}
		else if(env.getProperty(name).equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", ProjectPath+"/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
	}
	
	public static void OpenUrl(String url) {
		driver.get(env.getProperty(url));
		//driver.close();
	}

}
