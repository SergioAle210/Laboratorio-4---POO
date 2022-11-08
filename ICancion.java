import java.time.Duration;

/**
 * ICancion
 */
public interface ICancion {
    /**
     * @return El nombre de la canción.
     */
    String obtenerNombre();

    /**
     * 
     * @return La duración de la canción.
     */
    Duration obtenerDuracion();

    /**
     * 
     * @return El género al que pertenece la canción.
     */
    String obtenerGenero();

    /**
     * 
     * @return El autor de la canción.
     */
    String obtenerAutor();
}