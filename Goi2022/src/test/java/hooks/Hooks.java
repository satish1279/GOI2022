package hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import pages.PageElements;

public class Hooks {

	static WebDriver driver =null;

	PageElements screenshots;

	/*
	public void takeScreenshot(WebDriver driver) throws IOException, InterruptedException {


		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		TakesScreenshot ts= ((TakesScreenshot)driver);

		File source= ts.getScreenshotAs(OutputType.FILE);

		File dest= new File("E:/Satish Jaiswal/DailySanity2022/AutoupdatedALLenv/" + driver.getTitle() +" " + timestamp + ".png");

		FileUtils.copyFile(source,dest);

	}


		pages =  new PageElements(driver);

			screenshots =  new PageElements(driver);
		screenshots.takeScreenshot();

	 */	

	@BeforeStep
	public void beforeStepHook() throws IOException, InterruptedException {
		Thread.sleep(500);
	}


	@AfterStep
	public void afterStepHook() throws IOException, InterruptedException {
		Thread.sleep(4000);





	}


}










