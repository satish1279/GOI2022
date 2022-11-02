package stepDefinitionsGoi2022;



import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageElements;

public class PomUSproduction {


	static WebDriver driver =null;


	PageElements pages;


	private static final Logger logger = LogManager.getLogger(PomUSproduction.class);



	@Given ("^User is on Login page wrt US_Production$")
	public void loginPage() throws IOException, InterruptedException {


		//WebDriverManager.firefoxdriver().setup();
		//driver= new FirefoxDriver();


		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https:goinfinity.beyond360hub.com/Account/Login");


		logger.info("Browser Started on Goi- US Production environment");
		logger.info("This is login page");
	}


	@When ("^User is logged in after entering the correct credentials wrt US_Production$")
	public void enterUsername() throws InterruptedException {

		pages =  new PageElements(driver);

		pages.entrUsernam();
		pages.entrPassword();
		pages.clickButton();	

		Thread.sleep(5000);
		logger.info("This is Homepage page");

	}


	// =========	Recognize Page  ========
	@And ("^Clicks on Recognize link wrt US_Production$")
	public void recogLink() throws InterruptedException, IOException {

		pages.clickRecognize();

		logger.info("This is Recognize page");

		Thread.sleep(2000); 
	}


	// =========	Skill Insight Page  ========
	@When ("^Clicks on Skill Insight link wrt US_Production$")
	public void skillinsightLink() throws InterruptedException {

		pages.clickSkillInsight();
		logger.info("This is Feedback page");
	}


	// =========	 Wellness  Page  ========
	@And ("^Clicks on Wellness link wrt US_Production$")
	public void WellnessLink() throws InterruptedException {

		pages.clickWellness();
		logger.info("This is Wellness page");
	}



	// =========	 Survey  Page  ========
	@When ("^Clicks on Survey link wrt US_Production$")
	public void SurveyLink() throws InterruptedException {

		pages.clickSurvey();
		logger.info("This is Survey page");
	}



	// =========	 My Summary  Page  ========
	@And ("^Clicks on My Summary link wrt US_Production$")
	public void MySummaryLink() throws InterruptedException, IOException {


		pages.clickMySummary();

		logger.info("This is My Summary page");

	}

	// =========	 Redeem Page  ========
	@When ("^Clicks on Redeem link wrt US_Production$")
	public void RedeemLink() throws InterruptedException {

		pages.clickRedeem();
		Thread.sleep(3000);
		logger.info("This is Redeem page");
	}


	// =========	 Dashboard & Reports Page  ========
	@And ("^Clicks on Dashboard link wrt US_Production$")
	public void DashboardLink() throws InterruptedException, IOException {



		pages.clickDashboard();	
		Thread.sleep(2000);


		logger.info("This is Dashboard page");

	}


	@When ("^Clicks on Reports tab wrt US_Production$")
	public void ReportTab() throws InterruptedException {
		pages.clickHome();
		Thread.sleep(2000);


		pages.clickDashboard();
		Thread.sleep(3000);
		pages.clickReports();
		logger.info("This is Reports page");
	}

	@And ("^Clicks on Budget Head Report option from Select Report dropdown wrt US_Production$")
	public void clickBudgetHeadReport() throws InterruptedException {


		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickBudgetHeadReport();
		Thread.sleep(1000);
		logger.info("This is Budget Head Report page");

	}


	@When ("^Clicks on Recognitions Report option from Select Report dropdown wrt US_Production$")
	public void clickRecognitionsReport() throws InterruptedException {

		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRecognitionsReport();
		Thread.sleep(5000);
		logger.info("This is Recognitions Report page");

	}

	@And ("^Clicks on Redemption Report option from Select Report dropdown wrt US_Production$")
	public void clickRedemptionReport() throws InterruptedException {


		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickRedemptionReport();
		Thread.sleep(3000);
		logger.info("This is Redemption Report page");

	}

	@When ("^Clicks on User Login Report option from Select Report dropdown wrt US_Production$")
	public void clickUserLoginReport() throws InterruptedException {



		pages.clickSelectReportDropdown();
		Thread.sleep(1000);
		pages.clickUserLoginReport();

		logger.info("This is User Login Report page");

	}


	@And ("^Clicks on Data Visualization tab wrt US_Production$")
	public void dataVisualizationTab() throws InterruptedException {



		pages.clickVisualization();
		logger.info("This is Data Visualization page");

	}

	// =========	 Admin Console Page  ========



	@When ("^Clicks on Admin Console link wrt US_Production$")
	public void adminConsole() throws InterruptedException, IOException {



		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clickAdminConsole();
		Thread.sleep(15000);


		//=========  switch to next tab ========

		String currentTab = driver.getWindowHandle();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(currentTab);

		driver.switchTo().window(newTab.get(0));
		Thread.sleep(20000);

		
		logger.info("This is Admin Console page");

		driver.close();

		driver.switchTo().window(currentTab);
		Thread.sleep(1500);

		pages.clickUserprofile();

	}


	//=========  Logout cum Login Page ========

	@And ("^Clicks on LogOut link wrt US_Production$")
	public void LogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(3000);

		pages.clickOkBtn();
		Thread.sleep(2000);

		logger.info("This is LogOut page");
	}


	@Then ("^User is navigated to login page wrt US_Production$")
	public void USprodLoginPg()  throws InterruptedException {

		System.out.println("this is login page");
		Thread.sleep(1000);

		driver.close();

		logger.info("Browser Closed");
	}

}






