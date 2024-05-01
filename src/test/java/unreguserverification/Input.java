package unreguserverification;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input {
	 File file;
	 FileInputStream fi;
	 XSSFWorkbook wb;
	 XSSFSheet sheet;
	 XSSFRow row;
	 XSSFCell cell1;
	 XSSFCell cell2;
	 int rownum=0, cellnum=0;
     public void fetch() throws IOException {	
	 file=new File("C:\\Users\\2318599\\eclipse-workspace\\Miniproject\\DATA\\Book1.xlsx");
     fi=new FileInputStream(file);
     wb=new XSSFWorkbook(fi);
     sheet=wb.getSheet("Sheet1");
     row=sheet.getRow(0);
    
     cell1=row.getCell(0);
     cell2=row.getCell(1);
     
   }
  
   public String password() {
	   String pass=cell2.getStringCellValue();
	   return pass;
   }
   public String email() {
	// TODO Auto-generated method stub
	   String email=cell1.getStringCellValue();
	   return email;
	   
    }
}
