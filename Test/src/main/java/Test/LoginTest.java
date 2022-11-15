package Test;
 
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	 
	public class LoginTest {
	public WebDriver driver;
	
	  @Test
	  public void Login() {
	driver.get("http://localhost/covid-tms/login.php");
	driver.findElement(By.id("username")).sendKeys("admin1");
	driver.findElement(By.id("inputpwd")).sendKeys("Swapnil");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[2]/div/input")).click();
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

