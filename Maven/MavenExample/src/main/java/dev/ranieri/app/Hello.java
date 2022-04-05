package dev.ranieri.app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hello {

    public static void main(String[] args) {

        try {
            //jdbc:postgresql://ranieri-db.cwrqnnecy1to.us-east-2.rds.amazonaws.com/postgres?user=postgres&password=gatorfan99
            Connection conn = DriverManager.getConnection("jdbc:postgresql://ranieri-db.cwrqnnecy1to.us-east-2.rds.amazonaws.com/postgres?user=postgres&password=gatorfan99");
            System.out.println(conn);
            // the connection object is the MAIN way we can interact with our database
            // you can execute sql statments by putting your sql command in prepareStatement and executin it
            String sqlStatement = "insert into employee values(default, 'Frank','Smith',40000);";
            PreparedStatement ps = conn.prepareStatement(sqlStatement);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
