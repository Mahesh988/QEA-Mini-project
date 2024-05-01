package unreguserverification;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    
	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Input in=new Input();
       
       //Browser to open
       System.out.println("Enter the browser chrome/edge ?");
       String browser=sc.next();
       
       //URL to open
       String url="https://change2naturalfoods.com/";
       Unreg.driverSetup(browser);
       Unreg.Website(url);
       Unreg.Maximize();  //Window got maximized
      
    	   in.fetch();
    	   String password=in.password();  //Fetch password
    	   String email=in.email();    //Fetch email
    	   Unreg.NaturalFoods(email, password);
       
    	   Unreg.Quit();
       
   }  
      
}
  