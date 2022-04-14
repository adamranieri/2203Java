# Javalin
- Web App framework for Java
- 
```Java
public class App {

    public static void main(String[] args) {

        // Javalin object is created via the Javalin create method
        // You configure this object to create your web app
        Javalin app = Javalin.create();
  
        // The context object is a poweful object 
        // Contains infromation about the incoming HTTP request.
        // Contains methods for sending an HTTP repsone

        Handler hola = context -> {
            context.result("Hola todos");
        };

        app.get("/hola", hola); // creating a route with the uri /hola, function to call when that uri with that verb is called
   
        app.start(7000); // Javalin will start listeing for http requests at that port
    }
}
```