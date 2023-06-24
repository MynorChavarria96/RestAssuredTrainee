package io.reqres.main.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReqresGeneralService {
    private ReqresGeneralService(){

    }
    public static Performable getListUser(String getLisUser) {
        return  instrumented(GetLisUser.class, getLisUser);
    }
}
