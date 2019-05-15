package com.openedge.pacreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testrun {

	static Workbook workbook;
	static Sheet sheet;

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileInputpath="F:\\Selenium\\Test Data Sheet\\PA_Creation.xlsx";
		FileInputStream file= new FileInputStream(fileInputpath);
		workbook=new XSSFWorkbook(file);
		System.out.println(workbook.getNumberOfSheets());
		
		DataFormatter dataformat=new DataFormatter();
		for(Sheet sheet:workbook) {
			
			
			System.out.println(sheet.getSheetName());
		}
		
	
		for(Row row:sheet) {
			for(Cell cell:row) {
				
				String cellvalue=dataformat.formatCellValue(cell);
				System.out.println(cellvalue);
				
			}
		}
	}

}
