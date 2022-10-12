package pages;


	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class PageElements {



		WebDriver driver;


		//============== Background ============//

		By txt_usrname=By.xpath("//input[@name='username']");

		By txt_password=By.xpath("//input[@name='password']");

		By btn_login=By.cssSelector("#cred_sign_in_button");


		public PageElements(WebDriver driver1) {
			this.driver=driver1;
		}

		public void entrUsernam() {
			driver.findElement(txt_usrname).sendKeys("satish.jaiswal@beyond360.com");
		}

		public void entrPassword() {

			driver.findElement(txt_password).sendKeys("pass@12345");
		}

		public void clikButon() {
			driver.findElement(btn_login).click();
		}






		//============== Log Out ============//


		By link_Homepage=By.xpath("//a[@class='cursorPointer'][@href='Home/Index']//span[@class='ng-binding'][contains(text(),'Home')]");

		By image_userProfile=By.xpath("//a[@class='user-profile dropdown-toggle ng-isolate-scope']//img[@class='ng-scope']");

		By btn_logOut=By.cssSelector("a[title='Logout']");

		By btn_OK=By.cssSelector("button[class='btn_filled btn_filled_primary']");



		public void clickHomepage() {	
			driver.findElement(link_Homepage).click();		
		}

		public void clickUserprofile() {	
			driver.findElement(image_userProfile).click();		
		}

		public void clicklogOut() {	
			driver.findElement(btn_logOut).click();		
		}	

		public void clickOkBtn() {	
			driver.findElement(btn_OK).click();		
		}








		//============== All Pages ============//

		By link_recognize=By.xpath("//a[@class='cursorPointer'and @href='Recognize/Recognize']//span[@class='ng-binding'][contains(text(),'Recognize')]");

		By link_skillInsight=By.xpath("//a[@class='cursorPointer'][@href='Feedback/Index']//span[@class='ng-binding'][contains(text(),'Skill Insight')]");

		By link_wellness=By.xpath("//a[@class='cursorPointer'][@href='Wellness/index']//span[@class='ng-binding'][contains(text(),'Wellness')]");

		By link_survey=By.xpath("//a[@class='cursorPointer'][@href='Survey/Index']//span[@class='ng-binding'][contains(text(),'Survey')]");

		By link_jobReferral=By.xpath("//a[@class='cursorPointer'][@href='managejob/index']//span[@class='ng-binding'][contains(text(),'Job Referral')]");

		By link_mySummary=By.xpath("//a[@class='cursorPointer'][@href='Home/viewProfile']//span[@class='ng-binding'][contains(text(),'My Summary')]");


		By link_redeem=By.xpath("//a[@class='cursorPointer'][@href='Redeem/RedeemPlus']//span[@class='ng-binding'][contains(text(),'Redeem')]");



		public void clickRecognize() {	
			driver.findElement(link_recognize).click();
		}

		public void clickSkillInsight() {	
			driver.findElement(link_skillInsight).click();
		}

		public void clickWellness() {	
			driver.findElement(link_wellness).click();
		}

		public void clickSurvey() {	
			driver.findElement(link_survey).click();
		}

		public void clickJob() {	
			driver.findElement(link_jobReferral).click();
		}

		public void clickMySummary() {	
			driver.findElement(link_mySummary).click();
		}



		public void clickRedeem() {	
			driver.findElement(link_redeem).click();
		}




		//============== Reports ============//

		By link_dashboard=By.xpath("//a[@class='cursorPointer'][@href='Dashboard/Dashboard']//span[@class='ng-binding'][contains(text(),'Dashboard')]");

		By tab_DataVisualization=By.xpath("//ul[@class='horizontal_block_tab_menu clearfix']/li[2]/a[1]");

		By tab_reports=By.xpath("//ul[@class='horizontal_block_tab_menu clearfix']/li[3]/a[1]");
		

		By dropdown_selectReports=By.xpath("//*[@class='sort-by res-sort clearfix dash_sort _visu']/li[2]");

		By report_BudgetHeadReport=By.xpath("//*[@class='k-list-scroller']/ul[1]/li[3]/span[1]/h2[1]");

		By report_RecognitionsReport=By.xpath("//*[@class='k-list-scroller']/ul[1]/li[12]/span[1]/h2[1]");

		By report_RedemptionReport=By.xpath("//*[@class='k-list-scroller']/ul[1]/li[14]/span[1]/h2[1]");

		By report_UserLoginReport=By.xpath("//*[@class='k-list-scroller']/ul[1]/li[20]/span[1]/h2[1]");





		public void clickDashboard() {	
			driver.findElement(link_dashboard).click();
		}

		public void clickVisualization() {	
			driver.findElement(tab_DataVisualization).click();
		}


		public void clickReports() {	
			driver.findElement(tab_reports).click();		
		}

		public void clickSelectReportDropdown() {	
			driver.findElement(dropdown_selectReports).click();		
		}

		public void clickBudgetHeadReport() {	
			driver.findElement(report_BudgetHeadReport).click();		
		}

		public void clickRecognitionsReport() {	
			driver.findElement(report_RecognitionsReport).click();		
		}

		public void clickRedemptionReport() {	
			driver.findElement(report_RedemptionReport).click();		
		}

		public void clickUserLoginReport() {	
			driver.findElement(report_UserLoginReport).click();		
		}



	}


