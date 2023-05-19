package uk.co.library.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) {

        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on More Search Options Link$")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("^I click on Find Jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobButton();
    }

    @Then("^verify the result \"([^\"]*)\"$")
    public void verifyTheResult(String result) {
        new ResultPage().verifyTheResults(result);
    }
}
