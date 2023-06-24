package io.reqres.main.models;

public class ResponseModel {
    private ResponseModel(){

    }
    private static String body;

    public static String getBody() {
        return body;
    }

    public static void setBody(String body) {
        ResponseModel.body = body;
    }
}
