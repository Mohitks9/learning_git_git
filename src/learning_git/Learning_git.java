package learning_git;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is working as Expected");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohit\\\\Kachra\\\\automationTesting\\\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohit\\\\Kachra\\\\automationTesting\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/13861486#overview");
		System.out.println(driver.getTitle());
		System.out.println("this is what you are this is what you have done");
		driver.quit();
		
		
	}

}
