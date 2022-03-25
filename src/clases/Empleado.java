package clases;

import java.sql.Date;

public class Empleado
{
	private String Id;
	private String Nombre;
	private String Cedula;
	private String Tanda;
	private int Comision;
	private Date Fecha;
	private String Estado;
	
	public Empleado(String id, String nombre, String cedula, String tanda, int comision, Date fecha, String estado)
	{
		this.Id = id;
		Nombre = nombre;
		Cedula = cedula;
		Tanda = tanda;
		Comision = comision;
		Fecha = fecha;
		Estado = estado;
	}
	
	public Empleado()
	{
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getTanda() {
		return Tanda;
	}

	public void setTanda(String tanda) {
		Tanda = tanda;
	}

	public int getComision() {
		return Comision;
	}

	public void setComision(int comision) {
		Comision = comision;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
}
