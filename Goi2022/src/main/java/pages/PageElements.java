package pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {



	WebDriver driver;


	//============== Login ============//

	@FindBy(xpath="//input[@name='username']")
	WebElement txt_usrname;

	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;

	@FindBy(css="#cred_sign_in_button")
	WebElement btn_login;



	//============== Log Out ============//

	@FindBy(xpath="//a[@class='user-profile dropdown-toggle ng-isolate-scope']//img[@class='ng-scope']")
	WebElement image_userProfile;

	@FindBy(css="a[title='Logout']")
	WebElement btn_logOut;

	@FindBy(css="button[class='btn_filled btn_filled_primary']")
	WebElement btn_OK;




	//============== All Pages ============//

	@FindBy(xpath="//a[@class='cursorPointer'and @href='Recognize/Recognize']//span[@class='ng-binding'][contains(text(),'Recognize')]")
	WebElement link_recognize;

	@FindBy(xpath="//a[@class='cursorPointer'][@href='Feedback/Index']//span[@class='ng-binding'][contains(text(),'Skill Insight')]")
	WebElement link_skillInsight;

	@FindBy(xpath="//a[@class='cursorPointer'][@href='Wellness/index']//span[@class='ng-binding'][contains(text(),'Wellness')]")
	WebElement link_wellness;

	@FindBy(xpath="//a[@class='cursorPointer'][@href='Survey/Index']//span[@class='ng-binding'][contains(text(),'Survey')]")
	WebElement link_survey;

	@FindBy(xpath="//a[@class='cursorPointer'][@href='managejob/index']//span[@class='ng-binding'][contains(text(),'Job Referral')]")
	WebElement link_jobReferral;

	@FindBy(xpath="//a[@class='cursorPointer'][@href='Home/viewProfile']//span[@class='ng-binding'][contains(text(),'My Summary')]")
	WebElement link_mySummary;

	@FindBy(xpath="//a[@class='cursorPointer'][@href='Redeem/RedeemPlus']//span[@class='ng-binding'][contains(text(),'Redeem')]")
	WebElement link_redeem;

	
	


	//============== Reports ============//
	
	@FindBy(xpath="//a[@class='cursorPointer'][@href='Dashboard/Dashboard']//span[@class='ng-binding'][contains(text(),'Dashboard')]")
	WebElement link_dashboard; 



	@FindBy(xpath="//ul[@class='horizontal_block_tab_menu clearfix']/li[3]/a[1]")
	WebElement tab_reports;

	@FindBy(xpath="//*[@class='sort-by res-sort clearfix dash_sort _visu']/li[2]")
	WebElement dropdown_selectReports;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[3]/span[1]/h2[1]")
	WebElement report_BudgetHeadReport;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[12]/span[1]/h2[1]")
	WebElement report_RecognitionsReport;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[14]/span[1]/h2[1]")
	WebElement report_RedemptionReport;

	@FindBy(xpath="//*[@class='k-list-scroller']/ul[1]/li[20]/span[1]/h2[1]")
	WebElement report_UserLoginReport;


	@FindBy(xpath="//ul[@class='horizontal_block_tab_menu clearfix']/li[2]/a[1]")
	WebElement tab_DataVisualization;




	//============== Constructor ============//


	public PageElements(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver,this);

	}






	//============== Login ============//

	public void entrUsernam() {
		txt_usrname.sendKeys("satish.jaiswal@beyond360.com");
	}

	public void entrPassword() {

		txt_password.sendKeys("pass@12345");
	}

	public void clikButon() {
		btn_login.click();
	}



	//============== Log Out ============//

	public void clickUserprofile() {	
		image_userProfile.click();		
	}

	public void clicklogOut() {	
		btn_logOut.click();		
	}	

	public void clickOkBtn() {	
		btn_OK.click();		
	}



	//============== All Pages ============//

	public void clickRecognize() {	
		link_recognize.click();
	}

	public void clickSkillInsight() {	
		link_skillInsight.click();
	}

	public void clickWellness() {	
		link_wellness.click();
	}

	public void clickSurvey() {	
		link_survey.click();
	}

	public void clickJob() {	
		link_jobReferral.click();
	}

	public void clickMySummary() {	
		link_mySummary.click();
	}

	public void clickRedeem() {	
		link_redeem.click();
	}




	//============== Reports ============//

	public void clickDashboard() {	
		link_dashboard.click();
	}



	public void clickReports() {	
		tab_reports.click();		
	}

	public void clickSelectReportDropdown() {	
		dropdown_selectReports.click();		
	}

	public void clickBudgetHeadReport() {	
		report_BudgetHeadReport.click();		
	}

	public void clickRecognitionsReport() {	
		report_RecognitionsReport.click();		
	}

	public void clickRedemptionReport() {	
		report_RedemptionReport.click();		
	}

	public void clickUserLoginReport() {	
		report_UserLoginReport.click();		
	}



	public void clickVisualization() {	
		tab_DataVisualization.click();
	}



}


