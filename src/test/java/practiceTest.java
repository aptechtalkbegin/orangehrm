import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceTest {

	public static void main(String[] args) throws InterruptedException {
		//1) Launch browser
		ChromeDriver driver= new ChromeDriver();
		
		//2) Launch application URL in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//3) Maximize window
		driver.manage().window().maximize(); 
        
		Thread.sleep(5000);
		
		// Click on MyAccount link
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		// Click on Register  link
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("Registration Page is displayed");
		
		driver.quit();

	}

}
