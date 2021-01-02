package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

  features = {"src/Feature"},
  glue = {"stepsDef"},
  plugin = {"pretty","html:target/cucumber-reports"}
  //"json:src/test/resources/json/cucumber.json" }
  //tags = {"@UnitTest"}

)


public class FbTestRunner {

}
