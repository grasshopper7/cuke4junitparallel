package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "stepdef", plugin = { "json:target/json-cucumber-reports/second/cukejson.json",
		"junit:target/junit-cucumber-reports-second/cukejunit.xml" }, features = "src/test/resources/features/second")
public class SecondRunner {
	
	@BeforeClass
	public static void before() {
		System.out.println("SECOND START - " +System.currentTimeMillis() );
	}

	@AfterClass
	public static void after() {
		System.out.println("SECOND END - " +System.currentTimeMillis() );
	}
}
