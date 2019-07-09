package objectrepository;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagefactory {
	
	WebDriver driver;
	
	public RediffHomepagefactory(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	@FindBy(id="srchword")
	WebElement Searchfield;
	
	@FindBy(xpath="//input[@class='newsrchbtn']")
	WebElement Searchbutton;
	
	public WebElement Searchfield()
	{
		return Searchfield;
	}
	
	public WebElement Searchbutton()
	{
		return Searchbutton;
	}
	


}
