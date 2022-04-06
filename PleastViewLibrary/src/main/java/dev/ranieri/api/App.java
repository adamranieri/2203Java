package dev.ranieri.api;

import dev.ranieri.data.BookDAOPostgresImpl;
import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import dev.ranieri.utilities.List;

import java.util.Date;
import java.util.Scanner;

public class App {

    public static BookService bookService = new BookServiceImpl(new BookDAOPostgresImpl());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Pleasant View Employee terminal");
        System.out.println("1. register New Book \n2. View All Books \n3. Check out book");
        System.out.println("Input choice");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:{
                System.out.println("Input Title of Book");
                String title = scanner.next();
                System.out.println("Input Author name");
                String author = scanner.next();
                Book book = new Book(0,title,author,0);
                App.bookService.registerBook(book);
                System.out.println("New book registered " + book);
            } break;
            case 2:{
                List<Book> books = bookService.libraryCatalogue();

                for(int i = 0; i < books.size(); i++){
                    System.out.println(books.get(i) + new Date(books.get(i).getReturnDate()).toString());
                }
            } break;
            case 3:{
                System.out.println("Input book id that you want to checkout");
                int id = scanner.nextInt();
                bookService.checkOut(id);
                System.out.println("Checked Out!");

            }break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
