package dev.ranieri.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection createConnection(){

        try {
            //"jdbc:postgresql://ranieri-db.cwrqnnecy1to.us-east-2.rds.amazonaws.com/librarydb?user=postgres&password=gatorfan99"
            Connection conn = DriverManager.getConnection(System.getenv("LIBRARYDB"));
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
