package dev.ranieri.configs;

import com.google.gson.Gson;
import dev.ranieri.data.BookDAO;
import dev.ranieri.data.BookDAOPostgresImpl;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import io.javalin.Javalin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class LibraryConfig {

    @Bean(name = "PostgresBookDAO")
    public BookDAO postgresDAO(){
        BookDAO bookDAO = new BookDAOPostgresImpl();
        return bookDAO;
    }

    @Bean(name = "BookService")
    public BookService bookService(){
        BookService bookService = new BookServiceImpl(this.postgresDAO());
        return bookService;
    }

    @Bean(name = "Gson")
    public Gson gson(){
        Gson gson = new Gson();
        return gson;
    }

    @Bean(name = "ProductionApp")
    public Javalin productionVersion(){
        return Javalin.create(javalinConfig -> {
            javalinConfig.enforceSsl = true;// javalin would only allow requests sent via HTTP
            javalinConfig.showJavalinBanner = false;
        });
    }

    @Bean(name = "DevApp")
    public Javalin devVersion(){
        return Javalin.create(javalinConfig -> {
            javalinConfig.enableDevLogging();
        });
    }

}
