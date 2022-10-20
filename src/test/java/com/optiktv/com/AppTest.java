package com.optiktv.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"stepdefinition", "pageobjects"},
        publish = true,
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }

)


public class AppTest 

{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */


    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
