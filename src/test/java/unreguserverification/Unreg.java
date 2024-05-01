package unreguserverification;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

 class Unreg {
	
	static WebDriver driver;
	public static void driverSetup(String browser)
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            System.out.println("1)Chrome browser opened");   //Chrome 
           
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            System.out.println("1)edge browser opened");      //Edge
		}
	}
	public static void Website(String link) {
		 driver.get(link);
		 System.out.println("2) https://change2naturalfoods.com/ Opened");  //To open url
	}
	
	public static void Maximize() {
		 driver.manage().window().maximize();
		 System.out.println("Window got MAXIMIZED!!");   //To maximize window
	}
	

	public static  void NaturalFoods(String email,String password) throws InterruptedException {
		// TODO Auto-generated method stub
   
		//Locate & click Login button
     driver.findElement(By.linkText("Login/Register")).click();
        //Enter unregistered email
     driver.findElement(By.id("email")).sendKeys(email);
        //Enter password
     driver.findElement(By.id("password")).sendKeys(password);
        //click Login button
     driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/form/div[3]/button")).click();
     Thread.sleep(5000);
     
     TakesScreenshot ts=(TakesScreenshot)driver;
     
     File src = ts.getScreenshotAs(OutputType.FILE);
     File trg=new File("C:\\Users\\2318599\\eclipse-workspace\\Miniproject\\Screenshot\\ss1.png");
     try {
		FileHandler.copy(src, trg);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     //System.out.println(System.getProperty("src/Screenshots/unreg.pg"));
     
     //Verifying and Getting error message
     String Error=driver.findElement(By.xpath("/html/body/section/div/div/div/div")).getText().split("\n")[0];
     System.out.println(Error);
	}
	
	// driver.quit();
	public static  void Quit() {
		driver.quit();
		
	}
}
