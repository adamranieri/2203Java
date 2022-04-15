package dev.ranieri.api;

import com.google.gson.Gson;
import dev.ranieri.data.BookDAOPostgresImpl;
import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import dev.ranieri.utilities.List;
import io.javalin.Javalin;

public class WebApp {

    public static BookService bookService = new BookServiceImpl(new BookDAOPostgresImpl());
    public static Gson gson = new Gson();

    public static void main(String[] args) {

        Javalin app = Javalin.create();

        //CREATE
        app.post("/books", context -> {
            String body = context.body();
            Book book = gson.fromJson(body, Book.class);// JSON fields need to match what the fields are in the class
            bookService.registerBook(book);
            context.status(201);// 201 is the status code for succesffully creating something
            String bookJSON = gson.toJson(book);
            context.result(bookJSON);
        });

//        //READ
        app.get("/books", context -> {

            String title = context.queryParam("title");
            if(title == null){
                List<Book> books = bookService.libraryCatalogue();
                String bookJSON = gson.toJson(books);
                context.result(bookJSON);
            }else{
                List<Book> books = bookService.getBooksByTitle(title);
                String bookJSON = gson.toJson(books);
                context.result(bookJSON);
            }
        });

       app.get("/books/{id}", context -> {
           int id = Integer.parseInt(context.pathParam("id"));

           try {
               String bookJSON =  gson.toJson(bookService.retrieveBookById(id));
               context.result(bookJSON);
           }catch (ResourceNotFound e){
               context.status(404);
               context.result("The book id " + id + "was not found");
           }

       });
//
//        //UPDATE
        app.put("/books/{id}",context -> {
            int id = Integer.parseInt(context.pathParam("id"));
            String body = context.body();
            Book book = gson.fromJson(body,Book.class);
            book.setId(id);// the id in the uri should take precedence
            bookService.replaceBook(book);
            context.result("Book replaced");
        });

        app.patch("/books/{id}/checkout", context -> {
            try {
                int id = Integer.parseInt(context.pathParam("id"));
                bookService.checkOut(id);
                context.status(204);
            }catch (ResourceNotFound e){
                context.status(404);
                context.result(e.getMessage());
            }

        });

        app.patch("/books/{id}/checkin", context -> {
            int id = Integer.parseInt(context.pathParam("id"));
            Book book = bookService.retrieveBookById(id);
            bookService.checkIn(book);
            context.result("Book checked in");
        });
//
//        //DELETE
        app.delete("/books/{id}", context -> {
            int id = Integer.parseInt(context.pathParam("id"));
            boolean result = bookService.destroyBookById(id);
            if(result){
                context.status(204);
            }else{
                context.status(500);
            }
        });

        app.start(7000);
    }
}
