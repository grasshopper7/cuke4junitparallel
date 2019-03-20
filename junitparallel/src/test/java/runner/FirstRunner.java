package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "stepdef", plugin = { "json:target/json-cucumber-reports/first/cukejson.json",
		"junit:target/junit-cucumber-reports-first/cukejunit.xml" }, features = "src/test/resources/features/first")
public class FirstRunner {

	@BeforeClass
	public static void before() {
		System.out.println("FIRST START - " +System.currentTimeMillis() );
	}

	@AfterClass
	public static void after() {
		System.out.println("FIRST END - " +System.currentTimeMillis() );
	}
}
