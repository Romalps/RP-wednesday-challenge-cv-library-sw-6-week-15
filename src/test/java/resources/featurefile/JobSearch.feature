Feature: JobSearch Test
  As a user I want to find a job on CVLibrary website
@sanity @regression
  Scenario Outline: verify job search result using different data set
  Given I am on Homepage
    When I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on More Search Options Link
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then verify the result "<result>"

 Examples:

  |jobTitle           |location               |distance         |salaryMin |salaryMax|salaryType    |jobType       |result                                      |
  |Tester             |Harrow, Greater London |5 miles          |30000     |500000   |Per annum     | Permanent    |Permanent Tester jobs in Harrow             |
  |Software Tester    |London                 |10 miles         |35000     |50000    |Per annum     |Permanent     |Permanent Software Tester jobs in London    |
  |Software Engineer  |Watford, Hertfordshire |5 miles          |35000     |60000    |Per annum     |Permanent     |Permanent Software Engineer jobs in Watford |
  |Automation Tester  |Harrow, Greater London |7 miles          |40000     |70000    |Per annum     |Permanent     |Permanent Automation Tester jobs in Harrow  |
  |Automation Engineer|Barnet, Greater London |5 miles          |40000     |70000    |Per annum     |Permanent     |Permanent Automation Engineer jobs in Barnet|
  |Test Analyst       |Harrow, Greater London |15 miles         |250       |500      |Per day       |Contract      |Contract Test Analyst jobs in Harrow        |
