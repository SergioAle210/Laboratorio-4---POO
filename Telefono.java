import java.util.ArrayList;

import javax.swing.Icon;

/*
Profesor: Lynette García
Auxiliar: Rodrigo Barrera y Gaby Contreras

INTEGRANTE: 
Sergio Alejandro Orellana Colindres (221122)
Andre Marroquín Tarrot (22266)
8/11/2022

Laboratorio 4

Curso: Programación Orientada a Objetos
Sección: 10

Representa la clase teléfono
*/

public class Telefono implements ITelefono, IContacto {
    private String Nombre;
    private String Numero;
    private String Dueño;
    Contacto contacto = new Contacto();
    ArrayList<IContacto> contactos;
    

    public Telefono() {
        Nombre = "";
        Numero = "";
        Dueño = "";
        contactos = new ArrayList<IContacto>();
    }

    /**
     * Sirve como base para obtener los datos de un telefono
     * @param Nombre: Obtiene el Nombre
     * @param Numero: Obtiene el Numero
     * @param Dueno: Obtiene el Dueno
     */
    public Telefono(String Nombre, String Numero, String Dueño, Contacto contacto) {
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Dueño = Dueño;
    }

    @Override
    public String obtenerNombre() {
        // TODO Auto-generated method stub
        return Nombre;
    }

    @Override
    public String obtenerNumero() {
        // TODO Auto-generated method stub
        return Numero;
    }

    
    public String obtenerDueño() {
        return Dueño;
    }

    @Override
    public ArrayList<IContacto> obtenerContactos() {
        contactos.add(new Contacto("Sergio Orellana", "5635-0874"));
        contactos.add(new Contacto("Andre Marroquin", "8473-3982"));
        contactos.add(new Contacto("Andre Jo", "8493-3483"));
        return contactos;
    }   
}
