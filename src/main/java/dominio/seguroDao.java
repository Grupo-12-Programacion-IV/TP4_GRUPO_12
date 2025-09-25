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
}


