import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(option);


		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		System.out.println("Hello");
		driver.findElement(By.xpath("(//span[@class='radioSelect'])[3]")).click();
		System.out.println("Hell2");
		/*driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		System.out.println("Hell3");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter City\"]")).sendKeys("cali colombia");
		driver.findElement(By.xpath("(//p[@class='lighterGreyText'])[1]")).click();
		System.out.println("Hell4");
		
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
		System.out.println("Done");*/

	}

}