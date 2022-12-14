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
    private String Numero;
    

    public Contacto() {
        Nombre = "";
        Numero = "";
    }

    /**
     * Sirve como base para obtener los datos de un telefono
     * @param Nombre: Obtiene el nombre del contacto
     * @param Numero: Obtiene el numero del contacto
     */
    public Contacto(String Nombre, String Numero) {
        this.Nombre = Nombre;
        this.Numero = Numero;
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

    
}
