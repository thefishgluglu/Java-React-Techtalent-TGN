package UD08;

public class Persona {

    private String nombre;
    private String edad;
    private String altura;
    private String peso;
    private String sexo = "hombre";
    private String dni = "00000000A";

    
    public Persona() {
        this.nombre = "";
        this.edad = "";
        this.altura = "";
        this.peso = "";
    }

    
    public Persona(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = "";
        this.peso = "";
    }

    
    public Persona(String nombre, String edad, String dni, String altura, String peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
}
