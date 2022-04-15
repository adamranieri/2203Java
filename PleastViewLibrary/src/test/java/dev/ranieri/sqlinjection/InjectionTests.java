package dev.ranieri.sqlinjection;

import dev.ranieri.utilities.ConnectionUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InjectionTests {

    @Test
    void injection() throws SQLException {

        Connection conn = ConnectionUtil.createConnection();
        Statement statement = conn.createStatement();
        String title = "'Get hacked lolz' where 1 = 1; -- "; //
        int id = 2;
        String sql = "update book set title = "+title+ " where book_id = "+id+";";
        statement.execute(sql);
    }
}
