package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AoachePOIExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File fname=new File("/Users/diva/Downloads/TestData.xlsx");
		File fname=new File("/Users/diva/eclipse-workspace/inetBanking/src/main/java/ApachePOI/TestData.xlsx");
		FileInputStream is=new FileInputStream(fname);
		
		XSSFWorkbook wb=new XSSFWorkbook(is);
		XSSFSheet sheet= wb.getSheetAt(0);
		
//printing only row1 and cell value
		XSSFRow row2=sheet.getRow(1);
		XSSFCell  cell=row2.getCell(1);
		String address=cell.getStringCellValue();
		System.out.println("address=="+address);
		
		wb.close();
		
		

	}

}
