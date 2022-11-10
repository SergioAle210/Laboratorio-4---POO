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

public class Reproduccion extends Radio implements ICancion {
    private String Nombre;
    private Duration Duracion;
    private String Genero;
    private String Autor;
    ArrayList<ArrayList<ICancion>> cancions;
    ArrayList<ICancion> cancions2;
    

    public Reproduccion() {
        Nombre = "";
        Genero = "";
        Autor = "";
        Duracion = Duration.ofMinutes(0);
        cancions = new ArrayList<ArrayList<ICancion>>(cancions);
        cancions2 = new ArrayList<ICancion>();
    }
    public Reproduccion(String Nombre, Duration Duracion, String Genero, String Autor, ArrayList<ArrayList<ICancion>> cancions, ArrayList<ICancion> cancions2) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Autor = Autor;
        this.cancions = cancions;
        this.cancions2 = cancions2;
    }
        
    

    public Reproduccion(String Nombre, Duration Duracion, String Genero, String Autor) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Autor = Autor;
    }

    @Override
    public ArrayList<ArrayList<ICancion>> obtenerPlaylists() {
        cancions2.add(new Reproduccion("Bones", Duration.ofMinutes(3), "Electronica", "Imagine Dragons"));
        cancions2.add(new Reproduccion("Billie Jean", Duration.ofMinutes(5), "Pop", "Michael Jackson"));
        cancions2.add(new Reproduccion("Fire to the Fuse", Duration.ofMinutes(4), "Electronica", "Watson Michael"));

        cancions.add(cancions2);
        
        
        return cancions;
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
