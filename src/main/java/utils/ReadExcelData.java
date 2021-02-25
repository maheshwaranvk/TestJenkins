package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class ReadExcelData extends ProjectSpecificMethods{
	
	
	
	public String[][] readExcel(String excelFileName) throws IOException {
		XSSFWorkbook xs = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = xs.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String [lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;

	}
}
