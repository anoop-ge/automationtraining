package com.exceleg;

//Program to put Iteration number in the first cell of new column in the first sheet.

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadeg3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// open file
		FileInputStream fis = new FileInputStream("./FirstExcel.xlsx");

		// read workbook
		Workbook wbook = new XSSFWorkbook(fis);

		System.out.println("No. of sheets" + wbook.getNumberOfSheets());

		int no_of_sheets = wbook.getNumberOfSheets();

		double value = 0;

		int no_of_rows = 0;
		Sheet st = null;
		for (int k = 0; k < no_of_sheets; k++) {
			// read sheet
			st = wbook.getSheetAt(k);

			no_of_rows = st.getPhysicalNumberOfRows();

			for (int i = 0; i < no_of_rows; i++) {
				// read rows
				Row row = st.getRow(i);

				//int no_of_cols = row.getLastCellNum();

				for (int j = 0; j < 1; j++) {
					// read cells
					Cell cell = row.getCell(j);

					value = value + cell.getNumericCellValue();
				}
			}
		}
		System.out.println("sum is " + value);
		
		
		double no_of_executions=0;
		
	    Row row=st.getRow(0);
	    Cell cell1=row.getCell(1);
	    
	    no_of_executions=cell1.getNumericCellValue();
	    
	    ++no_of_executions;
	    fis.close();

		FileOutputStream fos = new FileOutputStream("./FirstExcel.xlsx");

		Row row1 = st.createRow(no_of_rows);
		System.out.println("Created row..." + (no_of_rows));
		
		Cell cell = row1.createCell(0);
		cell.setCellValue(value);
		
		
	    
	    
	    cell1.setCellValue(no_of_executions);
	    
	
		wbook.write(fos);

		fos.close();
		
		//Row row1 = st.getRow(0);
	//	Cell cell1 = row1.getCell(1);
		//double value1;

     	//value1 = cell1.getNumericCellValue();

		//value1++;
		//cell1.setCellValue(value1);
		
		
		
		

	}
}
