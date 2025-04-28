package Tarea_5;

public class materias {
	private String nombre;
	private String curso;
	private String profesor;
	private String aula;
	
	
	public materias() {
		this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.aula = aula;
    }
	
	public materias(String nombre, String curso, String profesor, String aula) {
		this.nombre = nombre;
		this.curso = curso;
		this.profesor = profesor;
		this.aula = aula;
	}
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getProfesor() {
		return profesor;
	}


	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getAula() {
		return aula;
	}


	public void setAula(String aula) {
		this.aula = aula;
	}
    @Override
        public String toString() {
    	        return "Nombre: " + nombre + "\nCurso: " + curso + "\nProfesor: " 
        + profesor + "\nAula: " + aula;
        }
    }
		


