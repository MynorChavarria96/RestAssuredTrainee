package io.reqres.main.interactions;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Service {
    private Service()
    {

    }

    public static Interaction restGetVerification(String resource) {
        return instrumented(GetStatusVerifcation.class, resource);
    }
}
