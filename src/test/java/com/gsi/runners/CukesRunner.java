package com.gsi.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                       "html:target/cucumber-reports.html",
                       "rerun:target/rerun.txt",
                       "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                       "json:target/cucumber.json"
              }

        , features = "src/test/resources/features" // locate to feature file
        , glue = "com/gsi/step_definitions" // locate to step_definitions
        , dryRun = false // if true only run feature file, if false it run ALL
        , tags = ""
        , publish = true //generating a report with public link

)
public class CukesRunner {}


