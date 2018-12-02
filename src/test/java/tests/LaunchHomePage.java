package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import launchtest.MKB.LoginPage;
import utils.PropFileReader;

public class LaunchHomePage {
	WebDriver driver ;
	PropFileReader prop = new PropFileReader();
  @Test
  public void loginHomePage() {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  LoginPage page1 = PageFactory.initElements(driver, LoginPage.class);
		  
	  page1.enterUserName(prop.getInstance().getProperty("Username"));
	  page1.enterPassword(prop.getInstance().getProperty("Password"));
	  page1.clickLogin();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", prop.getInstance().getProperty("chrome_driver"));
	   driver = new ChromeDriver();
	  
	 driver.get(prop.getInstance().getProperty("BrowserURL"));
	 driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Home Page launched successfully");
	  driver.quit();
  }

}
