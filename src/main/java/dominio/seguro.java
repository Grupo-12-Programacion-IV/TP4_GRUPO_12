package dominio;

public class seguro {
	private int idSeguro;
	private String descripcion;
	private int idTipo;
	private double costoContratacion;
	private double costoAsegurado;

	public seguro() {
		
	}

	public seguro(int idSeguro, String descripcion, int idTipo, double costoContratacion, double costoAsegurado) {
		super();
		this.idSeguro = idSeguro;
		this.descripcion = descripcion;
		this.idTipo = idTipo;
		this.costoContratacion = costoContratacion;
		this.costoAsegurado = costoAsegurado;
	}

	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public double getCostoContratacion() {
		return costoContratacion;
	}

	public void setCostoContratacion(double costoContration) {
		this.costoContratacion = costoContration;
	}

	public double getCostoAsegurado() {
		return costoAsegurado;
	}

	public void setCostoAsegurado(double costoAsegurado) {
		this.costoAsegurado = costoAsegurado;
	}

	
	public String toString() {
		return "Seguro: idSeguro=" + idSeguro + ", drescripcion=" + descripcion + ", idTipo=" + idTipo
				+ ", costoContration=" + costoContratacion + ", costoAsegurado=" + costoAsegurado;
	}
	
	
	
}
