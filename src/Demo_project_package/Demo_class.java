package Demo_project_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_class {

	public static void main(String[] args) {
		//set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ronnie\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://wwww.facebook.com");
driver.navigate().to("https://www.facebook.com");
driver.manage().window().maximize();
WebElement emailorphnumber= driver.findElement(By.name("email"));
emailorphnumber.sendKeys("pinkybenjamin@gmail.com");
WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("29kc51dy");
WebElement Login=driver.findElement(By.name("login"));
Login.click();
//driver.close();
	}

}
