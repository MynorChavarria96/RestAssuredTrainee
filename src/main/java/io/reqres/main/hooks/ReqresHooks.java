package io.reqres.main.hooks;

import io.cucumber.java.Before;
import io.reqres.main.exceptions.exceptionLoadProperties;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReqresHooks {
    static Properties properties = new Properties();
    @Before
    public void setUpOnStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }
    @Before
    public void onStage() throws exceptionLoadProperties {
        try (FileReader reader = new FileReader("src/test/resources/endpoint.properties")){
            properties.load(reader);
        }
        catch (IOException e){
            throw new exceptionLoadProperties("Error en la carga del archivo de propiedades ",e);
        }
    }

    public static Properties getProperties(){
        return  properties;
    }
}
