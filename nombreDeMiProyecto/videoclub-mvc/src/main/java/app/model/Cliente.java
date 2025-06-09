package app.model;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String dni;
    private String fecha;

    public Cliente() {}

    public Cliente(int id, String nombre, String apellido, String direccion, String dni, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fecha = fecha;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
