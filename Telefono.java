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

public class Telefono /*implements ITelefono */{
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

    
    /** 
     * @return String
     */
    public String getDueno() {
        return this.Dueno;
    }

    
    /** 
     * @param Dueno
     */
    public void setDueno(String Dueno) {
        this.Dueno = Dueno;
    }

    
    /** 
     * @return Contacto
     */
    public Contacto getContacto() {
        return this.contacto;
    }

    
    /** 
     * @param contacto
     */
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

}
