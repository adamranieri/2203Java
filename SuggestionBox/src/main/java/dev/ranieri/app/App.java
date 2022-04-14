package dev.ranieri.app;

import com.google.gson.Gson;
import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class App {

    static List<Suggestion> suggestionList = new ArrayList();

    public static void main(String[] args) {
        Suggestion snax = new Suggestion("More snax", 100);
        Suggestion coffeeMaker = new Suggestion("Coffee Maker needs fixing", 50);
        suggestionList.add(snax);
        suggestionList.add(coffeeMaker);

        Javalin app = Javalin.create();

        app.post("/suggestions", context -> {
            String body = context.body();
            Gson gson = new Gson();
            Suggestion suggestion = gson.fromJson(body, Suggestion.class);
            suggestionList.add(suggestion);
            context.status(201);
            context.result("Created a suggestion!!!");
        });

        app.get("/suggestions", context -> {
            Gson gson = new Gson();
            String json = gson.toJson(suggestionList);
            context.result(json);
        });

        app.start(7000);
    }
}
