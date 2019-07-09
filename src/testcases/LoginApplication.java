package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import objectrepository.RediffHomepage;
import objectrepository.RediffHomepagefactory;
import objectrepository.RediffLoginpage;

public class LoginApplication {
	

	@Test
	
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeeva\\Work\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd = new RediffLoginpage(driver);
		
		rd.Emailid().sendKeys("test@mail.com");
		rd.Password().sendKeys("12345");
		//rd.Submit().click();
		rd.Home().click();
		
		RediffHomepagefactory rh = new RediffHomepagefactory(driver);
		
		rh.Searchfield().sendKeys("books");
		rh.Searchbutton().click();
		
	}


}