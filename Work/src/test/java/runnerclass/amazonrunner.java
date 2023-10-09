package runnerclass;


     import org.junit.Test;
     import org.junit.runner.RunWith;
	 import io.cucumber.junit.Cucumber;
	 import io.cucumber.junit.CucumberOptions;
     import org.junit.runner.RunWith;

    

	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = "src/main/java/feature/amazon.feature",
	        glue = "runnerclass.stepdefinition",
            plugin = {"pretty", "html:target/cucumber-reports"}
	)
	public class amazonrunner {
		@Test
	    public void testSomething() {
	        // Your test logic goes here
	    }
	}



	