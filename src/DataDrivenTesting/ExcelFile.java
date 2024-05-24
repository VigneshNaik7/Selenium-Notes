package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File F = new File(".\\TestData\\Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(F);
		
		//basically we are converting excel file  into workbook factory because excel have different type of extenstion to avoide that problem we use this
		Workbook workbook = WorkbookFactory.create(fis);
		
		
		//write which sheet name in getsheet row in getrow and cell in the getcell and which type we want then use
																						//getStringCellValue,getNumericCellValue,getbooleanCellValue
		String datavalue = workbook.getSheet("Sheet1").getRow(2).getCell(4).getStringCellValue();
		
		System.out.println(datavalue);
		

	}

}
