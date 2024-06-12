package PageObjects;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class BeCognizantPage extends BasePage {
	public BeCognizantPage(WebDriver driver) {
		super(driver);
		
	}
	
	// User Button
	
	@FindBy(xpath="//*[@id='O365_MainLink_MePhoto']")
	WebElement user_details_btn;
	
	@FindBy(xpath="//*[@id='mectrl_currentAccount_primary']")
	WebElement UserName;
	// User Details
	@FindBy(xpath="//*[@id='mectrl_currentAccount_secondary']")
	 WebElement UserMail;
	
	
	// User Button Method
	public void userButton()  {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		// Click the User Button
		user_details_btn.click();
	}
	
	// User Name Method
	
	public String userName() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Getting an User Name
		String userName=UserName.getText();
		return userName;
		
	}
	//user Mail Method
		public String userMail() {
			
			// Getting an User Mail Id
			String userMail=UserMail.getText();
			return userMail;
			
		}
		
	
	// OneCognizant Button 
	 //@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[3]/section/article/div/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/a")
	 WebElement oneCognizant;
	 
	 @FindBy(xpath="//*[@id=\"spPageCanvasContent\"]/div/div/div/div/div/div/div[3]")
	 WebElement scroll;
	 public void oneCognizantClick() {
		 // Scroll and Click an One cognizant 
		 
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://onecognizant.cognizant.com/Home");
	 }
	 
	 

}
