
package UD08;

public class T08_01 {

    private String nombre;
    private String edad;
    private String altura;
    private String peso;
    private String sexo = "hombre";
    private String dni = "00000000A";

    
    public T08_01() {
        this.nombre = "";
        this.edad = "";
        this.altura = "";
        this.peso = "";
    }

    
    public T08_01(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = "";
        this.peso = "";
    }
    public T08_01(String nombre, String edad, String dni, String altura, String peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    
    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getAltura() {
		return altura;
	}


	public void setAltura(String altura) {
		this.altura = altura;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

}
	

