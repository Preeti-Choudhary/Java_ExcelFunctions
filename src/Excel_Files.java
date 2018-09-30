import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class Excel_Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Creating work book
		System.getProperty("user.dir");
		FileOutputStream fileout = new FileOutputStream("C:\\Workspace\\Module7\\Workbook.xls");
		HSSFWorkbook wb = new HSSFWorkbook();
		
		
		//creating sheet
		
		HSSFSheet sheet1 = wb.createSheet("First Sheet");
		HSSFSheet sheet2 = wb.createSheet("Second sheet");
		
		
		//Creating rows and cells
		for (int i=0; i<100; i++)
		{
			HSSFRow row = sheet1.createRow(i);
			for (int j=0; j<4; j++)
			{
				HSSFCell cell = row.createCell(j);
				cell.setCellValue(j);
			}
			
		}
		
		wb.write(fileout);
		fileout.close();
		
		String ProjectLocation = System.getProperty("user.dir");
		
		System.out.println(ProjectLocation);
		
		FileOutputStream FO = new FileOutputStream (ProjectLocation + "\\Playing.xls");
		HSSFWorkbook wb2 = new HSSFWorkbook ();
		
		HSSFSheet sheet3 = wb.createSheet("new sheet");
		HSSFRow row1 = sheet3.createRow(0);
		row1.createCell(0).setCellValue(true);
		row1.createCell(1).setCellValue(2);
		
		
		wb2.write(FO);
		FO.close();
		
	    /*HSSFWorkbook wb = new HSSFWorkbook();
	    HSSFSheet sheet = wb.createSheet("new sheet");
	    HSSFRow row = sheet.createRow((short)2);
	    row.createCell(0).setCellValue(1.1);
	    row.createCell(1).setCellValue(new Date());
	    row.createCell(2).setCellValue(Calendar.getInstance());
	    row.createCell(3).setCellValue("a string");
	    row.createCell(4).setCellValue(true);
	    row.createCell(5).setCellType(Cell.CELL_TYPE_ERROR);

	    // Write the output to a file
	    FileOutputStream fileOut = new FileOutputStream("workbook2.xls");
	    wb.write(fileOut);
	    fileOut.close();*/
		}

}
