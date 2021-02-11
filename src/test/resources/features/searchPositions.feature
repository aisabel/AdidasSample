Feature: search QA positions in Careers Adidas Group

  Scenario Outline: search QA positions
    Given user is in Careers Adidas Group
    When search for "<position>" in "<location>"
    And click Find Jobs button
    Then results are displayed

    Examples:
      | position                   | location  |
      | Quality Assurance Engineer | Amsterdam |
      | QA Software Engineer       | Amsterdam |

