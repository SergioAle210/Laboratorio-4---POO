/**
 * IModoProductividad
 */
public interface IModoProductividad {

    /**
     * @return un resumen del pronóstico del día de hoy.
     */
    default String obtenerPronóstico() {
        return "";
    }
}