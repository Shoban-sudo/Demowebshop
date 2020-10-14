package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Base class contains methods that are commonly used by testcases
 * @author Shobanbabu MR
 *
 */
public class Baseclass {

	public static Properties properties=null;
	public static WebDriver driver=null;


	/**
	 * This method contains the loading the property file
	 * @throws IOException
	 */
	public Properties loadAll() throws IOException
	{
		FileInputStream stream=new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(stream);
		return properties;
	}


	/**
	 * This method executes before the @Test execution
	 * This method contains thebasic functionality of driver, URL loading and common wait
	 * @throws IOException
	 */

	@BeforeMethod
	public void browserLaunch() throws IOException
	{
		loadAll();
		String Browser=properties.getProperty("browser");
		String URL=properties.getProperty("url");
		String Driverlocation=properties.getProperty("driverlocation");

		if(Browser.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver",Driverlocation );
			ChromeOptions options=new ChromeOptions();
			driver=new ChromeDriver(options);
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	/**
	 * This method executes after the @Test execution
	 * and also a common used function by the testcases
	 */
	@AfterMethod
	public void browserClose()
	{
		driver.quit();
	}

}
