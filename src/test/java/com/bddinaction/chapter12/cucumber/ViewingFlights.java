package com.bddinaction.chapter12.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber/viewing-points.json"}, tags = {"@viewing-flights"})
public class ViewingFlights {
}
