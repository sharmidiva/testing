package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIWritetoExcel {
public static  void main(String args[]) throws IOException {
        
    	//Create an object of File class to open xlsx file
        File file =    new File("/Users/diva/Downloads/NewTest.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.getSheet("STUDENT_DATA");
        
        //Create a row object to retrieve row at index 3
        XSSFRow row2=sheet.createRow(5);
        
        //create a cell object to enter value in it using cell Index
        row2.createCell(0).setCellValue("Sam");
        row2.createCell(1).setCellValue("TRoy");
        row2.createCell(2).setCellValue("djanes@gmail.com");
        row2.createCell(3).setCellValue("Female");
        row2.createCell(4).setCellValue("8786858432");
        row2.createCell(5).setCellValue(" San Francisco");
        
        //write the data in excel using output stream
        FileOutputStream outputStream = new FileOutputStream("/Users/diva/Downloads/NewTest.xlsx");
        wb.write(outputStream);
        wb.close();
        
        System.out.println("added");

}
}
