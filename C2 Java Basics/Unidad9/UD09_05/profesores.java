package UD09_05;

public class profesores {
	private String nombre;
	private int edad;
	private String sexo;
	private String asignatura;
	private String asistencia;
	
	public profesores() {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asignatura = asignatura;
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

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(String asistencia) {
		this.asistencia = asistencia;
	}
    @Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nAsignatura: " + asignatura
				+ "\nAsistencia: " + asistencia;
	}
	
	
}
