package dominio;

import java.sql.*;
import java.util.ArrayList;

public class tipoSeguroDao {
    private String host = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pass = "root";
    private String dbName = "segurosgroup";

    public tipoSeguroDao() {

    }

    public ArrayList<tipoSeguro> obtenerTiposSeguros() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<tipoSeguro> lista = new ArrayList<tipoSeguro>();
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(host + dbName, user, pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipos_seguros");

            while (rs.next()) {
                tipoSeguro tipoRs = new tipoSeguro();
                tipoRs.setIdTipo(rs.getInt("idTipo"));
                tipoRs.setDescripcion(rs.getString("descripcion"));
                lista.add(tipoRs);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
