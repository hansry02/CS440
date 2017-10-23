import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
 
class JDBCTest {

    private static final String url = "jdbc:mysql://localhost/luther";
 
    private static final String user = "root";
 
    private static final String password = "root";
 
    public static void main(String args[]) {
        MySQL db = new MySQL();
        Connection db_connection = null;
        Statement statement = null;
        ResultSet results = null;
        
        try {
        	db.createDB(url,user,password);
        } catch (SQLException sqle) {
            System.err.printf("connect() failed%n");
            System.err.printf("%s%n", sqle.getMessage());
        }
    }
}