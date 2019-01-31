package excelprog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 
{
public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException 
{
FileInputStream f = new FileInputStream("./Excel/New.xlsx");
Workbook w = WorkbookFactory.create(f);
Sheet sh = w.getSheet("Sheet1");
int r = sh.getLastRowNum();
for(int i=0;i<=r;i++)
{
	Row r1 = sh.getRow(i);
	short cell = r1.getLastCellNum();
	for(int j=0;j<cell;j++)
	{
		Cell c1 = r1.getCell(j);
		String data = c1.toString();
		System.out.println(data);
	}
}
}
}
