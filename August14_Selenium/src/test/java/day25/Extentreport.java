package day25;

import com.aventstack.extentreports.ExtentReports;

public class Extentreport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("SNP.html");
    spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("Excelr");
	extent.attachReporter(spark);
	
	ExtentTest test = extent.createTest("Login Test");
	test.pass("Login Succesfull");
	test.fail("SNP failed");
	extent.flush();
	
//ASK

	}

}
