import java.util.ArrayList;

/**
 * ITelefono
 */
public interface ITelefono {

    /**
     * @return El nombre del teléfono. EJ: Redmi Note 8
     */
    String obtenerNombre();

    /**
     * @return El número del teléfono.
     */
    String obtenerNumero();

    /**
     * @return El dueño del teléfono.
     */
    String obtenerDueño();

    /**
     * @return Los contactos del teléfono.
     */
    ArrayList<IContacto> obtenerContactos();
}