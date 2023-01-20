package org.example.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Googlesearch.feature"},
        glue = {"org.example.stepdefinitions"}
)
public class CucumberRunner {
}
