package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
	
	WebDriver driver;
	
	public RediffHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Searchfield = By.id("srchword");
	By Searchbutton = By.xpath("//input[@class='newsrchbtn']");
	
	public WebElement Searchfield()
	{
		return driver.findElement(Searchfield);
	}
	
	public WebElement Searchbutton()
	{
		return driver.findElement(Searchbutton);
	}
	


}
