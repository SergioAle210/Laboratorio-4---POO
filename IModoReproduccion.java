import java.util.ArrayList;

/**
 * IModoReproduccion
 */
public interface IModoReproduccion {

    /**
     * @return una lista con todas las playlists disponibles.
     */
    ArrayList<ArrayList<ICancion>> obtenerPlaylists();

    /**
     * Selecciona una de las playlists guardadas.
     * 
     * @param posicion la posición de la playlist a seleccionar.
     */
    void seleccionarPlaylist(int posicion);

    /**
     * Selecciona la siguiente cancion dentro de la lista de reproducción.
     */
    void siguienteCancion();

    /**
     * Selecciona la canción anterior dentro de la lista de reproducción.
     */
    void cancionAnterior();

    /**
     * @return la canción reproduciendose actualmente.
     */
    ICancion obtenerCancion();
}