Feature: testing the different endpoints on the reqres.io testing page

  @ListUser
  Scenario: endpoint getting list of users
    Given that consumes the endpoints get the list of user
    When extract "Michael" is data
    Then valid that is correct last name "Lawson"

    @ListResource
    Scenario: endpoint getting list resource
      Given that consumes the endpoint get list resource
      When find the resource of the name "true red"
      Then valid that its id of resource is 3

     @Update
     Scenario: endpoint updating the name and the job
       Given that consumes the endpoint update
       When extract the job of response
       Then valid the job is "zion resident"


