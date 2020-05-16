import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class UDBrowserDisableNot {
	
	public static FileInputStream fis;
	public static Properties prop;
	public static Properties data;
	public static String ProjectPath=System.getProperty("user.dir");
	public static WebDriver driver;
	
	public static void init() throws Exception {
		fis=new FileInputStream(ProjectPath+"/environment.properties");
		prop=new Properties();
		prop.load(fis);
		String env = prop.getProperty("env");
		System.out.println(env);
		
		fis=new FileInputStream(ProjectPath+"/"+env+".properties");
		data=new Properties();
		data.load(fis);
	}
	
	public static void LaunchBrowser(String Browser) {
		
		if(data.getProperty(Browser).equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ProjectPath+"/drivers/geckodriver");
			//initiate user defined firefox browser
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("myprofile");
			profile.setPreference("dom.webnotifications.enabled", false);
			//System.out.println(profile);
			FirefoxOptions opt=new FirefoxOptions();
			opt.setProfile(profile);
			driver=new FirefoxDriver(opt);
		}
		else if(data.getProperty(Browser).equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ProjectPath+"/drivers/chromedriver");
			ChromeOptions cpt=new ChromeOptions();
			cpt.addArguments("user-data-dir=/Users/Martindoss/Library/Application Support/Google/Chrome/Profile 1");
			
			//Handle Notification
			cpt.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(cpt);
			
			
			
		}
		
	}

	
	public static void OpenUrl(String url) {
		
		driver.get(data.getProperty(url));
		
	}
}




