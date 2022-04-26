package connection.bucs;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	public static Connection createConnection() {
		String url = System.getenv("MY_CONN");
		try {
			Connection conn = (Connection) DriverManager.getConnection(url);
			return conn;
		}catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}
}
