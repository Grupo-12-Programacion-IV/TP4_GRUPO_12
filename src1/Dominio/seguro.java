package Dominio;

public class seguro {
	private int idSeguro;
	private String drescripcion;
	private int idTipo;
	private double costoContration;
	private double costoAsegurado;

	public seguro() {
		
	}

	public seguro(int idSeguro, String drescripcion, int idTipo, double costoContration, double costoAsegurado) {
		super();
		this.idSeguro = idSeguro;
		this.drescripcion = drescripcion;
		this.idTipo = idTipo;
		this.costoContration = costoContration;
		this.costoAsegurado = costoAsegurado;
	}

	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}

	public String getDrescripcion() {
		return drescripcion;
	}

	public void setDrescripcion(String drescripcion) {
		this.drescripcion = drescripcion;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public double getCostoContration() {
		return costoContration;
	}

	public void setCostoContration(double costoContration) {
		this.costoContration = costoContration;
	}

	public double getCostoAsegurado() {
		return costoAsegurado;
	}

	public void setCostoAsegurado(double costoAsegurado) {
		this.costoAsegurado = costoAsegurado;
	}

	
	public String toString() {
		return "Seguro: idSeguro=" + idSeguro + ", drescripcion=" + drescripcion + ", idTipo=" + idTipo
				+ ", costoContration=" + costoContration + ", costoAsegurado=" + costoAsegurado;
	}
	
	
	
}
