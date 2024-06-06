package basics;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHandling31 {

    
	public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\wayes\\eclipse-workspace\\seleniumdemos\\ExcelFolder\\Datafile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        String sh = sheet.getSheetName();
        System.out.println(sh);
        int rowcount = sheet.getPhysicalNumberOfRows();
        System.out.println("Total no of rows:" + rowcount);

        int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Total no of columns:" + columncount);

        String[][] mydata = new String[rowcount][columncount];

        DataFormatter df = new DataFormatter();
        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < columncount; j++) {
                // System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j))+ "\t");
                mydata[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));

            }

        }
        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < columncount; j++) {
                System.out.print(mydata[i][j] + "\t");
            }
            System.out.println();
        
        
        
    }
}
}