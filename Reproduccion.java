import java.time.Duration;
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

Representa la clase reproduccion
*/

public class Reproduccion  implements ICancion, IModoReproduccion {
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

    @Override
    public ArrayList<ArrayList<ICancion>> obtenerPlaylists() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void seleccionarPlaylist(int posicion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void siguienteCancion() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancionAnterior() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ICancion obtenerCancion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String obtenerNombre() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Duration obtenerDuracion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String obtenerGenero() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String obtenerAutor() {
        // TODO Auto-generated method stub
        return null;
    }



}
