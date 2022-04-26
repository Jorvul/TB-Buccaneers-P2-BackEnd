package connection.bucs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClientPostgresDAO implements DAO {
	@Override
	public List<Client> getAllClients() {
		Connection conn = Connection.createConnection();
		Client c;
		PreparedStatement pstmt;
		ArrayList<Client> cList = new ArrayList<Client>();
		String selectAllClients = "SELECT * From bankaccount";

		try {
			pstmt = conn.prepareStatement(selectAllClients);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("client_id");
				String name = rs.getString("client_name");
				int capHit = rs.getInt("client_cap_hit");
				int baseSalary = rs.getInt("client_base_salary");
				int signingBonus = rs.getInt("client_signing_bonus");
				int merchandise = rs.getInt("client_merchandise");
				int active = rs.getInt("client_active");
				int salaryIncrease = rs.getInt("client_salary_increase");
				int age = rs.getInt("client_age");
				String position = rs.getString("client_position");
				c = new Client(id, name, capHit, baseSalary, signingBonus, merchandise, active, salaryIncrease, age, position);
				cList.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cList;
	}
	}

	
	