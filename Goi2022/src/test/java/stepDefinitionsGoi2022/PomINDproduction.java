package stepDefinitionsGoi2022;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageElements;
import util.TakeSS;



public class PomINDproduction {


	static WebDriver driver =null;


	PageElements pages;
	TakeSS screenshots;



	private static final Logger logger = LogManager.getLogger(PomINDproduction.class);

	@BeforeStep
	public void beforeStepHook() throws IOException, InterruptedException {
		Thread.sleep(500);
	}


	@AfterStep
	public void afterStepHook() throws IOException, InterruptedException {

		screenshots = new TakeSS(driver);
		//screenshots.takeScreenshot();
		Thread.sleep(500);
	}



	@Given ("^User is on Login page wrt Ind_Production$")
	public void loginPage() throws IOException, InterruptedException {


		//		WebDriverManager.firefoxdriver().setup();
		//		driver= new FirefoxDriver();


		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://goinfinity.beyond360tech.com/");


		logger.info("Browser Started on Goi- India Production environment");
		logger.info("This is login page");
	}


	@When ("^User is logged in after entering the correct credentials wrt Ind_Production$")
	public void enterUsername() throws InterruptedException {

		pages =  new PageElements(driver);

		pages.entrUsernam();
		pages.entrPassword();
		//pages.clikButon();	

		Thread.sleep(5000);
		logger.info("This is Homepage page");

	}


	//	=========	Recognize Page  ========
	@And ("^Clicks on Recognize link wrt Ind_Production$")
	public void recogLink() throws InterruptedException {

		System.out.println("test");
		/*
		pages.clickRecognize();
		screenshots.takeScreenshot();
		logger.info("This is Recognize page");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");

		 */

	}


	//	=========	Skill Insight Page  ========
	@When ("^Clicks on Skill Insight link wrt Ind_Production$")
	public void skillinsightLink() throws InterruptedException {
		System.out.println("test");
		//pages.clickSkillInsight();
		logger.info("This is Feedback page");
	}


	//	=========	 Wellness  Page  ========
	@And ("^Clicks on Wellness link wrt Ind_Production$")
	public void WellnessLink() throws InterruptedException {
		System.out.println("test");
		//pages.clickWellness();
		logger.info("This is Wellness page");
	}



	//=========	 Survey  Page  ========
	@When ("^Clicks on Survey link wrt Ind_Production$")
	public void SurveyLink() throws InterruptedException {
		//System.out.println("test");
		pages.clickSurvey();
		logger.info("This is Survey page");
	}



	//	=========	 My Summary  Page  ========
	@And ("^Clicks on My Summary link wrt Ind_Production$")
	public void MySummaryLink() throws InterruptedException {
		System.out.println("test");
		/*
		pages.clickMySummary();
		screenshots.takeScreenshot();
		//logger.info("This is My Summary page");

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,790)");

		 */
	}

	//	=========	 Redeem Page  ========
	@When ("^Clicks on Redeem link wrt Ind_Production$")
	public void RedeemLink() throws InterruptedException {
		System.out.println("test");
		//	pages.clickRedeem();
		logger.info("This is Redeem page");
	}


	//	=========	 Dashboard & Reports Page  ========
	@And ("^Clicks on Dashboard link wrt Ind_Production$")
	public void DashboardLink() throws InterruptedException {
		System.out.println("test");

		/*
		pages.clickDashboard();	
		Thread.sleep(2000);

		screenshots.takeScreenshot();
		//		logger.info("This is Dashboard page");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,740)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);


		js.executeScript("window.scrollBy(0,630)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);


		js.executeScript("window.scrollBy(0,550)");
		screenshots.takeScreenshot();
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,500)");
		 */
	}


	@When ("^Clicks on Reports tab wrt Ind_Production$")
	public void ReportTab() throws InterruptedException {
		System.out.println("test");

		//		pages.clickReports();
		//		logger.info("This is Reports page");

	}

	@And ("^Clicks on Budget Head Report option from Select Report dropdown wrt Ind_Production$")
	public void clickBudgetHeadReport() throws InterruptedException {
		System.out.println("test");

		//		pages.clickSelectReportDropdown();
		//		Thread.sleep(1000);
		//		pages.clickBudgetHeadReport();
		//		Thread.sleep(1000);
		logger.info("This is Budget Head Report page");

	}


	@When ("^Clicks on Recognitions Report option from Select Report dropdown wrt Ind_Production$")
	public void clickRecognitionsReport() throws InterruptedException {
		System.out.println("test");
		//		pages.clickSelectReportDropdown();
		//		Thread.sleep(1000);
		//		pages.clickRecognitionsReport();
		//		Thread.sleep(5000);
		logger.info("This is Recognitions Report page");

	}

	@And ("^Clicks on Redemption Report option from Select Report dropdown wrt Ind_Production$")
	public void clickRedemptionReport() throws InterruptedException {
		System.out.println("test");

		//		pages.clickSelectReportDropdown();
		//		Thread.sleep(1000);
		//		pages.clickRedemptionReport();
		//		Thread.sleep(3000);
		logger.info("This is Redemption Report page");

	}

	@When ("^Clicks on User Login Report option from Select Report dropdown wrt Ind_Production$")
	public void clickUserLoginReport() throws InterruptedException {

		System.out.println("test");

		//		pages.clickSelectReportDropdown();
		//		Thread.sleep(1000);
		//		pages.clickUserLoginReport();
		//
		logger.info("This is User Login Report page");

	}


	@And ("^Clicks on Data Visualization tab wrt Ind_Production$")
	public void dataVisualizationTab() throws InterruptedException {

		System.out.println("test");

		//		pages.clickVisualization();
		logger.info("This is Data Visualization page");

	}

	//=========	 Admin Console Page  ========

	@When ("^Clicks on Admin Console link wrt Ind_Production$")
	public void adminConsole() throws InterruptedException, IOException {
		System.out.println("test");

		/*
		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clickAdminConsole();
		Thread.sleep(1000);


// ==============  switch to next tab ===========================

		String currentTab = driver.getWindowHandle();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(currentTab);

		// change focus to new tab
		driver.switchTo().window(newTab.get(0));
		Thread.sleep(8000);

		screenshots.takeScreenshot();

		logger.info("This is Admin Console page");
		driver.close();

		driver.switchTo().window(currentTab);
		Thread.sleep(500);

		pages.clickUserprofile();

		 */
	}


	//=========	 Logout cum Login Page  ========

	@And ("^Clicks on LogOut link wrt Ind_Production$")
	public void LogoutLink() throws InterruptedException {

		pages.clickUserprofile();
		Thread.sleep(2000);

		pages.clicklogOut();
		Thread.sleep(3000);

		pages.clickOkBtn();
		Thread.sleep(2000);

		logger.info("This is LogOut page");
	}


	@Then ("^User is navigated to login page wrt Ind_Production$")
	public void IndProdLoginPg()  throws InterruptedException {

		System.out.println("this is login page");
		Thread.sleep(1000);

		driver.close();

		logger.info("Browser Closed");
	}

}





