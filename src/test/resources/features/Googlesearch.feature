Feature: feature to test google functionality
  @validcredentials
  Scenario Outline: Validate google search is working
    Given browser window is open
    And Enter url
    When Google is opened
    Then search "<username>" and "<password>" with google
    And click Enter
    Examples:
      | username | password |
      | google  | twitter |
      |facebook | tesla |
