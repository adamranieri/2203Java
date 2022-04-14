package dev.ranieri.app;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class App {

    public static void main(String[] args) {

        Javalin app = Javalin.create();

        //Javalin uses lambdas
        Handler hello = context -> {
            context.status(451);// response will say it is a teapot
            // as the developer you are responsible for assigning status codes
            // Javalin defaults all status codes to 200. redirect automatically attahces a 300 in javalin
            context.result("Hello everyone!");
        };

        Handler hola = context ->{
            System.out.println(context.url());//
            context.result("Hola todos");
        };

        // you could return HTML instead of just a string
        Handler helloPage = context ->{
            context.html("<h1>Hi everyone </h1>");
        };

        Handler espn = context -> {
            context.redirect("https://www.espn.com/nba/");
        };

        Handler randomNumber = context ->{
            int randInt = (int) (Math.random()*100);
            System.out.println("Someone called my route!!");
            // you can do any logic you want. this is regular Java code
            context.status(200);// set a 200 status code for the response
            context.result("Your random number is "+ randInt);
            // result is what sends the HTTP response

        };

        // Routes are define by specify the http verb.(uri,handerLambda)
        // the lambda is a snippet of code to execute when the web app recieves an http request to that uri
        app.get("/greeting",hello);
        app.get("/hola", hola);
        app.get("/home",helloPage);
        app.get("/espn",espn);
        app.get("/rando", randomNumber);

        app.get("/wassup/{name}", context -> {
            String personName = context.pathParam("name");

            if(personName.length() == 1){
                context.status(400);
                context.result("Why no name :(");
            }else{
                String greeting = "Hello " + personName;
                context.status(200);
                context.result(greeting);
            }

        });

        // using an anoymous function. Function was not stored in a variable first
        app.get("/bonjour", context -> {
            context.result("Bonjour");
        });

        //:: operator allows you to take a static method from a class and treat it like a standalone function
        Handler german = HelloController::gutenttag;

        app.get("/gutentag", german);

        app.start(7000);

    }
}
