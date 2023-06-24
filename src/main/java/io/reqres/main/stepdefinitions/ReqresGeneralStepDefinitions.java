package io.reqres.main.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reqres.main.hooks.ReqresHooks;
import io.reqres.main.tasks.ReqresGeneralService;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReqresGeneralStepDefinitions {
    @Given("that consumes the endpoints get the list of user")
    public void thatConsumesTheEndpointsGetTheListOfUser() {
        theActorInTheSpotlight().attemptsTo(
                ReqresGeneralService.getListUser(ReqresHooks.getProperties().getProperty("getLisUser"))
        );
    }

    @When("extract {string} is data")
    public void extractIsData(String string) {

    }

    @Then("valid that is correct last name {string}")
    public void validThatIsCorrectLastName(String string) {

    }

    @Given("that consumes the endpoint get list resource")
    public void thatConsumesTheEndpointGetListResource() {

    }

    @When("find the resource of the name {string}")
    public void findTheResourceOfTheName(String string) {

    }

    @Then("valid that its id of resource is {int}")
    public void validThatItsIdOfResourceIs(Integer int1) {

    }

    @Given("that consumes the endpoint update")
    public void thatConsumesTheEndpointUpdate() {

    }

    @When("extract the job of response")
    public void extractTheJobOfResponse() {

    }

    @Then("valid the job is {string}")
    public void validTheJobIs(String string) {

    }

}
