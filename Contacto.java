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

Representa la clase Contacto
*/

public class Contacto implements IContacto /* implements IContacto */ {
    private String Nombre;
    private int Numero;
    

    public Contacto() {
        Nombre = "";
        Numero = 0;
    }

    /**
     * Sirve como base para obtener los datos de un telefono
     * @param Nombre: Obtiene el nombre del contacto
     * @param Numero: Obtiene el numero del contacto
     */
    public Contacto(String Nombre, int Numero) {
        this.Nombre = Nombre;
        this.Numero = Numero;
    }


    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.Nombre;
    }

    
    /** 
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    /** 
     * @return int
     */
    public int getNumero() {
        return this.Numero;
    }

    
    /** 
     * @param Numero
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
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

    
}
