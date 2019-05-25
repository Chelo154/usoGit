package Modelo;

public class Persona {
    private Integer dni;
    private String nombre;
    private String apellido;

    public Persona(Integer dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}
