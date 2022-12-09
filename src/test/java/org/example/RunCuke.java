package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@product", plugin = {"pretty","html:target/cucumber-reports.html"}, publish = true)


//@regression  (For category)
//@product  (For cellPhone Product)
//@user (For register page)



public class RunCuke {
}
