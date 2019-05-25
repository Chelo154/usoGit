package Presentador;
import Modelo.*;
public class PresentadorHolaPersona{
    private IHolaPersona ventana ;
    public PresentadorHolaPersona(IHolaPersona vista){
        this.ventana = vista;
    }
    public void agregarPersona(String nombre, String apellido, Integer dni){
        Persona nuevo = new Persona(dni,nombre,apellido);
        ventana.saludarPersona("Hola "+nuevo.getApellido()+","+nuevo.getNombre()+"!!!");
    }

}

