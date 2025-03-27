package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
  
  Properties prop = new Properties();
  String filePath;

    public ReadPropertiesFile() {
        this.filePath = "..\\ngenuity\\src\\main\\resources\\propFiles\\config.properties";
    }
  
  
  public String ReadPropertiesFileByKey(String key) throws FileNotFoundException{
    
    File file = new File(filePath);
    FileInputStream fis = new FileInputStream(file);    
    try {
      prop.load(fis);
    } catch (IOException e) {
      System.err.println("An IOException occurred: " + e.getMessage());
    }
    return prop.getProperty(key);
    
    
  }
}
