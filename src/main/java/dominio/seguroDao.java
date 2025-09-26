package dominio;

import java.sql.*;

import java.util.ArrayList;

public class seguroDao {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";

	public seguroDao() {

	}

	public ArrayList<seguro> obtenerSeguros() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		ArrayList<seguro> lista = new ArrayList<seguro>();
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM seguros");

			while (rs.next()) {
				seguro seguroRs = new seguro();
				seguroRs.setIdSeguro(rs.getInt("idSeguro"));
				seguroRs.setDescripcion(rs.getString("descripcion"));
				seguroRs.setIdTipo(rs.getInt("idTipo"));
				seguroRs.setCostoContratacion(rs.getDouble("costoContratacion"));
				seguroRs.setCostoAsegurado(rs.getDouble("costoAsegurado"));
				lista.add(seguroRs);
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public int obtenerProximoId() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		int proximoId = 1;

		try {
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT MAX(idSeguro) as maxId FROM seguros");

			if (rs.next()) {
				proximoId = rs.getInt("maxId") + 1;
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proximoId;
	}

	public boolean agregarSeguro(seguro s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		boolean exito = false;

		try {
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			String sql = "INSERT INTO seguros (idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado) VALUES ("
					+
					s.getIdSeguro() + ", '" + s.getDescripcion() + "', " + s.getIdTipo() +
					", " + s.getCostoContratacion() + ", " + s.getCostoAsegurado() + ")";

			int filasAfectadas = st.executeUpdate(sql);
			if (filasAfectadas > 0) {
				exito = true;
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exito;
	}
}
