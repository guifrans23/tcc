package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe modelo - Conexão com o banco
 * 
 * @author Village Market 
 *
 */
public class DAO {
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.131:3306/village_market";
	private String user = "root";
	private String password = "123@senac";
	
	/**
	 * Método responsável pela conexão
	 * @return con / null
	 */
	public Connection conectar() {
		// objeto usado para conexão
		Connection con = null;
		// tratamento de exceções
		try {
			// uso do driver
			Class.forName(driver);
			// estabelecer a conexão
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}