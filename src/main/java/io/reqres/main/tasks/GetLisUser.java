package io.reqres.main.tasks;

import io.reqres.main.interactions.Service;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GetLisUser implements Task {
private final String resource;

    public GetLisUser(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Service.restGetVerification(resource)
        );
    }
}
