package com.automation.tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.pageObjects.HomePage;
import com.automation.pageObjects.LoginPage;
import com.automation.utilities.BaseTest;
import com.automation.utilities.ExcelReader;

public class LoginTest extends BaseTest{
  @Test(dataProvider = "TestData1")
  public void LoginTestCase( String username, String password){
    System.out.println(username);
    System.out.println(password);
    HomePage.LoginLinkWebElement(driver).click();
    LoginPage.EmailFieldWebElement(driver).sendKeys(username);
    LoginPage.PasswordFieldWebElement(driver).sendKeys(password);
    System.out.println(driver.getTitle());
  }
  @DataProvider(name = "TestData1")
  public Object[][] LoginTestData() throws Exception{
    ExcelReader ER = new ExcelReader();
    return ER.getExceData();
  }
}
