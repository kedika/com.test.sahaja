# Automation Tests

This test suite contains scenario to order Summer Tshirt test.

# Framework Tools and Libraries
* **BDD Test Specification**: Cucumber (Gherkin), structured English sentences
* **Main Programming Language**: Java
* **UI Automation**: Selenium-Webdriver
* **Supported Browsers**: chrome, firefox & IE
* **Build tool**: Maven
* **Utilities**: Lombok, SL4j (logging), Picocontainer(Dependency Injection)
* **IDE**: Intellij
* **Assertions** : Hamcrest, Junit
* **Intellj Plugins**: Cucumber for Java, Gherkin & lombok

Browser is optional, which can be chrome, firefox. The default browser is Chrome.
Also, as in any Webdriver based test suite, you'll have to have [Chromedriver](https://sites.google.com/a/chromium.org/chromedriver/) and/or [Geckodriver](https://github.com/mozilla/geckodriver/releases) available in your PATH

# Page Object Model
PageObjects are used to store the WebElements for a Web Page. A good practice is to have a separate class for every single WebPage. To avoid duplication for multiple pages which have common web page elements a Parent class can be created and the child class can then inherit.
Every Page class extends "Base.class" to make use of the WebDriver Object and utility functions.
# Example
public class DeliveryPage extends BasePage {

    By deliveryAddress = By.cssSelector(".displayaddressDiv");

# Run Tests
TestRunner class is used to run a group of Tests which are tagged and represented in form of Feature files & Scenarios.

Location of runner class  - src/main/java/runner/TestRunner.java

@CucumberOptions(features = "src/test/resources/features", glue = {"stepDefinitions"}, tags = "@Filter or @E2E",
plugin = {"pretty", "html:target/report/cucumber.html",
"json:target/report/cucumber.json"},
monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}

Tags:
@Regression - Tests to run part of regression

# Report
HTML Report will be generated at /target/report/cucumber.html

# Future Improvements
- Take Screenshot for failing tests
- Parallel Test execution to reduce test run time
- Jenkins Integration (standalone or pipeline)




	
