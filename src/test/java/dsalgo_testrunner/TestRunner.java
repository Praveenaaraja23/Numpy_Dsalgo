package dsalgo_testrunner;
    import org.junit.runner.RunWith;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/dsAlgoReport.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
				monochrome=false,  //console output color
				tags ="@Tree", //tags from feature file
				features = {"src/test/resources/dsalgo_features"}, //location of feature files
				glue= {"dsalgo_stepdefinitions","dsalgo_hooks"})//location of step definition files


		public class TestRunner extends AbstractTestNGCucumberTests {
			
			@Override
		    @DataProvider(parallel =false)
		    public Object[][]  scenarios() {
						
				return super.scenarios();
				
		    }
		}


	