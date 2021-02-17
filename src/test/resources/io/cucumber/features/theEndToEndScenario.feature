Feature: This is an end to end scenario with two applications and different results

  #Remark: this scenario has not yet implemented step definitions to not compromise logged in profiles
  # and create defect applications in Adidas database

  Scenario Outline: user applies for two positions
    Given user is logged in careers profile
    When  user apply for "<position 1>"
    And position status is "Application in progress",
    Then apply for "<position 2>"
    Examples:
      | position 1            | position 2                 |
      | QA Software Engineer  | Quality Assurance Engineer |

  Scenario Outline: search position 1 in careers portal
    Given user is in Careers Adidas Group
    When search for "<position 1>" in "<location>"
    And click Find Jobs button
    Then "<position 1>" is not retrieved anymore

    Examples:
      | position 1            | location  |
      | QA Software Engineer  | Amsterdam |

  Scenario Outline: position 2 application closed
    Given "<position 2>" is reviewed by recruitment team
    When "<position 2>" status is "Application is closed"
    Then user can not apply anymore to the same position

    Examples:
      | position 2                  |
      | Quality Assurance Engineer  |

    Scenario Outline: search position 2 in careers portal
      Given user is in Careers Adidas Group
      When search for "<position 2>" in "<location>"
      And click Find Jobs button
      And "<position 2>" is open
      Then user contact hiring team

      Examples:
      | position 2                 | location  |
      | Quality Assurance Engineer | Amsterdam |