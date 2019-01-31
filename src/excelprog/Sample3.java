package excelprog;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 
{
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
{
//Step1
	 FileInputStream f = new FileInputStream("./Excel/New.xlsx");
	 
	 //Step2
	   Workbook w = WorkbookFactory.create(f);
	   
	   //Step3
	   Sheet sh = w.getSheet("Sheet1");
	   
	   Row row = sh.getRow(0);
	   short cell = row.getLastCellNum();
	   System.out.println(cell);
}
}
