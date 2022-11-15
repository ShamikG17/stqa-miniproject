package Test;
 
	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	 
	public class BtnTest {
	public WebDriver driver;
	  @Test
	  public void Testbtn1(){
		  // page
	driver.get("http://localhost/covid-tms/live-test-updates.php");
	// Registerd user mobile number
	
	// Class path 
	driver.findElement(By.xpath("/html/body/div/ul/li[2]/div/div/a[1]")).click();
	//String s=driver.getCurrentUrl();
	  
	  }
	 
	  @BeforeClass
	  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHAMIK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  }
	 
	  @AfterClass
	  public void afterClass() {
	  driver.quit();
	  }
	 
	}

