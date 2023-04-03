Feature: Login SougeDemo Web Page

  @login @shopping @a
  Scenario: Login With Valid Credentials
    Given go to web page
    When the user enters user name "standard_user" and password "secret_sauce" and clicks login button
    Then verify that the user access the product page "Products" successfully