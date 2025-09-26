package dominio;

public class tipoSeguro {
    private int idTipo;
    private String descripcion;

    public tipoSeguro() {

    }

    public tipoSeguro(int idTipo, String descripcion) {
        super();
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return "TipoSeguro: idTipo=" + idTipo + ", descripcion=" + descripcion;
    }
}
