package CommonUtil;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener{
	
	ExtentReports report;
	JavaUtil jutil = new JavaUtil();
	@Override
	public void onTestStart(ITestResult result) {
		String methodname= result.getMethod().getMethodName();
		Reporter.log(methodname+"TestScript execution is Started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String methodname= result.getMethod().getMethodName();
		Reporter.log(methodname+"TestScript execution is passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String message = result.getThrowable().toString();
		String methodname= result.getMethod().getMethodName();
		Reporter.log(methodname+"  TestScript execution is failed  "+message,true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname= result.getMethod().getMethodName();
		Reporter.log(methodname+"TestScript execution is Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		//String methodname= result.getMethod().getMethodName();
//		Reporter.log("Execution is Started",true);
		
		//Use ExtentSparkReporter 
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extentreport/report"+jutil.getRandomNumber()+".html");
		reporter.config().setDocumentTitle("Vtigercrm");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Junu");
		
		//Use ExtentReport to generate extentreport 
	    report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("OS", "Windows 10 pro");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Version", "122.0.6261.95 ");
		report.setSystemInfo("Author", "Juned");
	}

	@Override
	public void onFinish(ITestContext context) {
		//String methodname= result.getMethod().getMethodName();
//		Reporter.log("Execution is Finished",true);
		report.flush();
	}

	
}
