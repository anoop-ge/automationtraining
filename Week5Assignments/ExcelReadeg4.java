package com.exceleg;

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadeg4 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// open file
		FileInputStream fis = new FileInputStream("./SecondExcel.xlsx");

		// read workbook
		Workbook wbook = new XSSFWorkbook(fis);

		System.out.println("No. of sheets" + wbook.getNumberOfSheets());

		int no_of_sheets = wbook.getNumberOfSheets();

		double value = 0;

		int no_of_rows = 0;
		Sheet st = null;

		// To Sum up the numbers in first sheet

		for (int k = 0; k < 1; k++) {
			// read sheet
			st = wbook.getSheetAt(k);

			no_of_rows = st.getPhysicalNumberOfRows();

			for (int i = 0; i < no_of_rows; i++) {
				// read rows
				Row row = st.getRow(i);

				// int no_of_cols = row.getLastCellNum();

				for (int j = 0; j < 1; j++) {
					// read cells
					Cell cell = row.getCell(j);

					value = value + cell.getNumericCellValue();
				}
			}
		}
		System.out.println("sum is " + value);

		// To read the count in the second sheet
		Double count;
		Sheet st1 = wbook.getSheet("Second Sheet");
		Row rownewsheet = st1.getRow(0);
		Cell newcell = rownewsheet.getCell(0);
		count = newcell.getNumericCellValue();
		count++;

		fis.close();

		FileOutputStream fos = new FileOutputStream("./SecondExcel.xlsx");

		Row row = st.createRow(no_of_rows);
		System.out.println("Created row..." + (no_of_rows));

		Cell cell = row.createCell(0);

		// Write the sum in the first sheet in a new row.
		cell.setCellValue(value);

		// Write the number of times program executed in the first cell in the second
		// sheet.
		newcell.setCellValue(count);

		wbook.write(fos);

		fos.close();
		wbook.close();

	}
}
