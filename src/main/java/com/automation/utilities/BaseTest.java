package com.automation.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  SelectBrowser select = new SelectBrowser();
  ReadPropertiesFile prop = new ReadPropertiesFile();
  
  protected WebDriver driver = null;
  
  @BeforeMethod
  public void launchBrowser() throws Exception{
      String url = prop.ReadPropertiesFileByKey( "URL");
    driver = select.selectBrowser();
    driver.navigate().to(url);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void closeBrowser(){
    
    driver.close();
    driver.quit();
    
  }
}
