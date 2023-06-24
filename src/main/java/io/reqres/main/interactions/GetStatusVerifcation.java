package io.reqres.main.interactions;

import io.reqres.main.models.ResponseModel;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetStatusVerifcation extends RestInteraction {
    private final String resource;
    private static final Logger LOGGER = LoggerFactory.getLogger(GetStatusVerifcation.class);

    public GetStatusVerifcation(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String response = String.valueOf(
                rest().contentType(ContentType.JSON)
                        .relaxedHTTPSValidation()
                        .when()
                        .get(resource)
                        .then().statusCode(200)
                        .extract().body().asString()
                );
        LOGGER.info(resource);
        LOGGER.info(response);
        ResponseModel.setBody(response);

    }
}
