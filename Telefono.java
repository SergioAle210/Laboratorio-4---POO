import java.util.ArrayList;

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

public class Telefono implements ITelefono {
    private String n;
    private String Nombre;
    private int Numero;
    private String Dueno;
    Contacto contacto = new Contacto();

    public Telefono() {
        Nombre = "";
        Numero = 0;
        Dueno = "";
        contacto = new Contacto();
    }

    /**
     * Sirve como base para obtener los datos de un telefono
     * @param Nombre: Obtiene el Nombre
     * @param Numero: Obtiene el Numero
     * @param Dueno: Obtiene el Dueno
     * @param contacto: Obtiene el contacto
     */
    public Telefono(String Nombre, int Numero, String Dueno, Contacto contacto) {
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Dueno = Dueno;
        this.contacto = contacto;
    }

    @Override
    public String obtenerNombre() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String obtenerNumero() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String obtenerDueño() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<IContacto> obtenerContactos() {
        // TODO Auto-generated method stub
        return null;
    }

    
  

}
