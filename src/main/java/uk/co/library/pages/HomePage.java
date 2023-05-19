package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Find Jobs']")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(linkText = "Accept All")
    WebElement acceptCookiesLink;
    public void enterJobTitle(String jobTitle) {

        sendTextToElement(jobTitleField, jobTitle);
        log.info("Enter the Job Title " + jobTitleField.toString());
    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
        log.info("Enter the Location " + locationField.toString());
    }

    public void selectDistance(String distance) {

        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Select the distance " + distanceDropDown.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
        log.info("Click on More search option link " + moreSearchOptionsLink.toString());
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        log.info("Enter Minimum Salary " + salaryMin.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        log.info("Enter Maximum Salary " + salaryMax.toString());
    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        log.info("Select Salary Type" + salaryTypeDropDown.toString());
    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("Select Job Type " + jobTypeDropDown.toString());
    }

    public void clickOnFindJobButton() {
        clickOnElement(findJobsBtn);
        log.info("Click on Find Job button " + findJobsBtn.toString());
    }
}
