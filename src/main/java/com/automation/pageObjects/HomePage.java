package com.automation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
  
  public static String  LoginLinkXpath = "//a[@class='ico-login']";
  
  public static WebElement  LoginLinkWebElement(WebDriver driver){
    return driver.findElement(By.xpath(LoginLinkXpath));
    
  }
}
