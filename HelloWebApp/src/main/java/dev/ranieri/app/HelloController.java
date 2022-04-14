package dev.ranieri.app;

import io.javalin.http.Context;

public class HelloController {

    // has the same exact method signature as the handler lambda
    public static void gutenttag(Context context){
        context.result("Gutentag");
    }
}
