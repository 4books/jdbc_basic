package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;

@Slf4j
public class DBConnectionUtil {

    //jdbc 표준 Connection
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get coneection={}, class={}", connection, connection.getClass());

            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
