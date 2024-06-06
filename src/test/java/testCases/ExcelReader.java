package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader{
	public static String[][]testdata() throws IOException{
		String file=("https://d.docs.live.net/0d8011c632d37494/Documents/Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String sh=sheet.getSheetName();
		System.out.println(sh);
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("Total no. of rows: "+rowcount);
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no. of rows: "+colcount);
		String[][]data=new String[rowcount][colcount];
		DataFormatter df=new DataFormatter();
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		return data;
	}
}

	

