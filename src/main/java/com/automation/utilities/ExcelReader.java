package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
  
  static ReadPropertiesFile prop = new ReadPropertiesFile();

  private static final Logger logger = LogManager.getLogger(ExcelReader.class);
  static FileInputStream fis = null;
  
  public  FileInputStream getFileInputStream() throws FileNotFoundException{
    
    String filepath = prop.ReadPropertiesFileByKey("filepath");
    File srcfile = new File(filepath);
    try {
      fis = new FileInputStream(srcfile);
    } catch (FileNotFoundException e) {
      logger.error("TestData File is not found. terminating process !!! Check Configuration file for file path of TestData file");
      System.exit(0);    
    }
    return fis;        
  }
  
  
  public  Object[][] getExceData() throws Exception{
    fis = getFileInputStream();
    
    String[][] arrayExcelData;
      try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
          XSSFSheet sheet = wb.getSheetAt(0);
          int TotalNumberOfRows = (sheet.getLastRowNum()+1);
          int TotalNumberOfCols =2;
          arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];
          for (int i = 0; i<TotalNumberOfRows; i++){
              for (int j=0; j<TotalNumberOfCols; j++){
                  XSSFRow row = sheet.getRow(i);
                  //        String cellData = row.getCell(j).toString();
                  arrayExcelData[i][j] = row.getCell(j).toString();
              }
          } }
    return arrayExcelData;
    
  }
    
}
