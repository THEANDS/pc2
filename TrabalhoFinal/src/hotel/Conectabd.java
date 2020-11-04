package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectabd {
	public static Connection getConnection() {
		String driver = "org.postgresql.Driver";
		String user = "postgres";/* Coloque o usuário criado para acesso ao banco */
		String senha = "aluado83";/* Coloque a senha para acesso ao banco */
		String url = "jdbc:postgresql://127.0.0.1:5432/hotel";/* Coloque o servidor onde está instalado o banco */
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, senha);
		} catch (ClassNotFoundException ex) {
			System.err.print(ex.getMessage());
		} catch (SQLException e) {
			System.err.print(e.getMessage());
		}
		return con;
	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
		}
	}

}
