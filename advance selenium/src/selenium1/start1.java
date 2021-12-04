package selenium1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class start1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./excel/java groups  for presentation 1.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	/*Row r=sh.createRow(5);
	Cell c=r.createCell(6);
	c.setCellValue("mysure");
	FileOutputStream fout= new FileOutputStream("./excel/Book1.xlsx");
	wb.write(fout);*/
	int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
	for(int i=0;i<rowcount+1;i++)
	{
		Row r= sh.getRow(i);
for(int j=0; j<r.getLastCellNum();j++)
{
	System.out.print(r.getCell(j).getStringCellValue()+ "||  ");
}
System.out.println();
	}
}
}
