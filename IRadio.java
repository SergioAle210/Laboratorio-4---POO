import java.util.ArrayList;

/**
 * IRadio
 */
public interface IRadio {
    public final int DELTA_VOLUMEN = 1;
    public final float DELTA_EMISORA = 0.5f;
    public final int MAX_EMISORAS_GUARDADAS = 50;

    /**
     * Enciende la radio.
     */
    void encender();

    /**
     * Apaga la radio.
     */
    void apagar();

    /**
     * Aumenta el volumen de la radio de acuerdo a DELTA_VOLUMEN.
     */
    void aumentarVolumen();

    /**
     * Disminuye el volumen de la radio de acuerdo a DELTA_VOLUMEN.
     */
    void disminuirVolumen();

    /**
     * Cambia el modo de la radio al modo dado.
     * 
     * @param nuevoModo El modo al que se quiere cambiar la radio.
     */
    void cambiarModo(ModosRadios nuevoModo);

    /**
     * Obtiene el actual de la radio
     */
    ModosRadios obtenerModo();

    // --MODO RADIO--

    /**
     * Cambia la banda a AM.
     */
    void cambiarA_AM();

    /**
     * Cambia la banda a FM.
     */
    void cambiarA_FM();

    /**
     * Cambia de emisora a una superior por DELTA_EMISORA.
     */
    void subirEmisora();

    /**
     * Cambia la emisora a una inferior por DELTA_EMISORA.
     */
    void bajarEmisora();

    /**
     * 
     * @return La emisora que esta reproduciendo actualmente.
     */
    float obtenerEmisoraActual();

    /**
     * 
     * @return Las emisoras guardadas.
     */
    ArrayList<Float> obtenerEmisorasGuardadas();

    /**
     * Obtiene la posición de la emisora dentro de las emisoras guardadas por el
     * usuario. Devuelve -1 si la emisora no está guardada.
     * 
     * @param emisora que se quiere obtener su posición
     * @return La posición de la emisora dentro de las guardadas por el usuario.
     */
    int obtenerPosicionEmisora(float emisora);

    /**
     * Guarda la emisora actual.
     */
    void guardarEmisoraActual();

    /**
     * Carga la emisora guardada en la posición solicitada.
     * 
     * @param posicion de la emisora a cargar.
     */
    void cargarEmisora(int posicion);

    // --MODO REPRODUCCIÓN--

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

    // --MODO TELÉFONO--

    /**
     * Intenta conectarse al teléfono dado.
     */
    boolean conectarTelefono(ITelefono telefono);

    /**
     * Se desconecta del teléfono dado.
     */
    void desconectarTelefono();

    /**
     * 
     * @return los contactos dados por el teléfono.
     */
    ArrayList<IContacto> obtenerContactos();

    // --MODO PRODUCTIVIDAD--

    /**
     * @return un resumen del pronóstico del día de hoy.
     */
    default String obtenerPronóstico() {
        return "";
    }
}