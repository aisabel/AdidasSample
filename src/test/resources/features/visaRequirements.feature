Feature: Job specific information with different visa requirements for same candidate
  #This is an edge case where the same candidate can have two different visa requirements for the same location.
  #Challenging assumption that all applications will be in different location everytime
  #Consider a validation to prevent this condition to happen

  #Remark: this scenario has not yet implemented step definitions to not compromise logged in profiles
  # and create defect applications in Adidas database

  Background:
    Given candidate is logged in careers profile
    And applied for "<position 1>" and "<position 2>"

  Scenario Outline: job specific information with two different visa requirements
    Given "<position 1>" and "<position 2>" status "Application in process" in the same "<location>"
    When 'Job specific information' grid is updated for "<position 1>"  with visa = no
    And 'Job specific information' grid  is updated for "<position 2>"  with visa = unknown
    Then user have two applications in process with different visa requirements for same location

    Examples:
      | position 1            | position 2                 | location  |
      | QA Software Engineer  | Quality Assurance Engineer | Amsterdam |
