import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> Name = new ArrayList<String>();
		ArrayList<String> UserId = new ArrayList<String>();
		ArrayList<String> Password = new ArrayList<String>();
		ArrayList<String> Unit = new ArrayList<String>();
		ArrayList<String> Location = new ArrayList<String>();
		
		FileInputStream filein = new FileInputStream("C:\\Workspace\\Module7\\EmployeeData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(filein);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		java.util.Iterator<Row> IR = sheet.rowIterator();
		
		int i=0;
		int j=0;
		
		while(IR.hasNext())
		{
			XSSFRow row = sheet.getRow(i);
			while(row.cellIterator().hasNext())
			{
				XSSFCell cell = row.getCell(j);
				//cell.getStringCellValue();
				Name.add(cell.getStringCellValue());
				//UserId.add(row.getCell(j).getStringCellValue());
				//Password.add(row.getCell(j).getStringCellValue());
				//Unit.add(row.getCell(j).getStringCellValue());
				//Location.add(row.getCell(j).getStringCellValue());
				j++;
			}
			i++;
			
		}
		
	}

}
