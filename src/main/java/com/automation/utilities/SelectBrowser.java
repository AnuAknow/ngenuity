package com.automation.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {
  private static final Logger logger = LogManager.getLogger(SelectBrowser.class);
  
  public WebDriver selectBrowser() throws Exception {
      ReadPropertiesFile prop = new ReadPropertiesFile();
      String browser = prop.ReadPropertiesFileByKey("browser");

      if (browser == null || browser.isBlank()) {
          logger.error("Browser is not specified in Configuration file. Terminating process!");
          throw new IllegalStateException("Browser configuration missing");
      }

      WebDriver driver;
      switch (browser.toLowerCase()) {
          case "firefox" -> {
              driver = new FirefoxDriver();
              logger.info("Browser selected for testing is: Mozilla Firefox");
          }

          case "chrome" -> {
              System.setProperty("webdriver.chrome.driver", "E:\\Dev\\java_projects\\chromedriver-win64\\chromedriver.exe");
              driver = new ChromeDriver();
              logger.info("Browser selected for testing is: Google Chrome");
          }

          case "ie" -> {
              System.setProperty("webdriver.ie.driver", "E:\\Dev\\java_projects\\edgedriver_win64\\msedgedriver.exe");
              driver = new InternetExplorerDriver();
              logger.info("Browser selected for testing is: Internet Explorer");
          }

          default -> {
              logger.error("Invalid browser specified. Update Configuration file with a valid browser (firefox, chrome, ie).");
              throw new IllegalArgumentException("Invalid browser configuration");
          }
      }

      return driver;
  }
}