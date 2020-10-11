import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ubstest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onlineservices.ubs.com/olsauth/ex/pbl/ubso/dl");
		
		WebElement RegisterLink=driver.findElement(By.cssSelector("a#registernow"));
	    RegisterLink.click();
		Thread.sleep(3000);
		
		WebElement Sections=driver.findElement(By.cssSelector("nav.wizard.bottom-line"));
		System.out.println(Sections.getText());
		
		WebElement TaxIdF=driver.findElement(By.id("ssn"));
		TaxIdF.sendKeys("1234");
		
		WebElement LastNF=driver.findElement(By.id("lastname"));
		LastNF.sendKeys("Test");
		
		WebElement Account1=driver.findElement(By.cssSelector("input.account-branch"));
		Account1.sendKeys("11");
		
		WebElement Account2=driver.findElement(By.cssSelector("input.account-number"));
		Account2.sendKeys("12345");
		
		WebElement Month=driver.findElement(By.cssSelector("input.month"));
		Month.sendKeys("01");
		
		WebElement Day=driver.findElement(By.cssSelector("input.day"));
		Day.sendKeys("12");
		
		WebElement Year=driver.findElement(By.cssSelector("input.year"));
		Year.sendKeys("2020");
		
		WebElement ContinueBtn=driver.findElement(By.id("personalcontinue"));
		ContinueBtn.click();
		
		Thread.sleep(3000);
		WebElement ErrorText=driver.findElement(By.cssSelector("div.notification-text"));
		System.out.println(ErrorText.getText());
	}

}
