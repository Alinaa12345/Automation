import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ubstest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onlineservices.ubs.com/olsauth/ex/pbl/ubso/dl");
		
		WebElement UserNameF=driver.findElement(By.cssSelector("input#username"));
		UserNameF.sendKeys("testwro8@gmail.com");
		
		WebElement PasswordF=driver.findElement(By.xpath("//input[@id='password']"));
		PasswordF.sendKeys("Password123");
		
		WebElement SignInBtn=driver.findElement(By.cssSelector("input#submit"));
		SignInBtn.click();
		
		Thread.sleep(3000);
		WebElement ErrorText=driver.findElement(By.cssSelector("div.notification-text"));
		System.out.println(ErrorText.getText());
}}
