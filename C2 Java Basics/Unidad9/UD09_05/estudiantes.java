package UD09_05;

public class estudiantes {
	private String nombre;
	private int edad;
	private String sexo;
	private String calificacion;
	private String asistencia;
	
	public estudiantes() {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.calificacion = calificacion;
		this.asistencia = asistencia;
	}
	

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public String getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(String asistencia) {
		this.asistencia = asistencia;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nCalificacion: " + calificacion
				+ "\nAsistencia: " + asistencia;
	}
	
	
}
