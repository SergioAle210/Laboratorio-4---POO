public class Productividad {
    private String Pronostico;


    public Productividad() {
        Pronostico = "";
    }

    /**
     * Sirve como base para obtener los datos de una Productividad
     * @param Pronostico
     */
    public Productividad(String Pronostico) {
        this.Pronostico = Pronostico;
    }

    
    /** 
     * @return String
     */
    public String getPronostico() {
        return this.Pronostico;
    }

    
    /** 
     * @param Pronostico
     */
    public void setPronostico(String Pronostico) {
        this.Pronostico = Pronostico;
    }


}
