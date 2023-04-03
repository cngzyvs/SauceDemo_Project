package com.sauceDemoTests.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/defoult-html-reprts",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/sauceDemoTests/step_defs",
        dryRun = false,
        tags = "@a"

)

public class CukesRunner {
}
