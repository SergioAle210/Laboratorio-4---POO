import java.time.Duration;

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

Representa la clase reproduccion
*/

public class Reproduccion /**  implements ICancion, IModoReproduccion */ {
    private String Nombre;
    private Duration Duracion;
    private String Genero;
    private String Autor;
    

    public Reproduccion() {
        Nombre = "";
        //Duration Duracion = new Duration();
        Genero = "";
        Autor = "";
    }

    public Reproduccion(String Nombre, Duration Duracion, String Genero, String Autor) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Autor = Autor;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Duration getDuracion() {
        return this.Duracion;
    }

    public void setDuracion(Duration Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return this.Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getAutor() {
        return this.Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    } 

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Duracion='" + getDuracion() + "'" +
            ", Genero='" + getGenero() + "'" +
            ", Autor='" + getAutor() + "'" +
            "}";
    }


}
