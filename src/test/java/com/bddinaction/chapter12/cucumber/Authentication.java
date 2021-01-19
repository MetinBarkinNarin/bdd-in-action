package com.bddinaction.chapter12.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@authentication"},
        plugin = {"pretty","json:target/cucumber/authentication.json"})
public class Authentication {
}
