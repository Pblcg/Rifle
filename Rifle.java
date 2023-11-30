public class Rifle {
    //Indica el modelo del Rifle
    private String tipoRifle;
    //Indica el tamaño del cargador
    private int tamañoCargador;
    //Indica si el gatillo está accionado
    private boolean gatilloAccionado;
    
    /**
     * Crea un rifle con su modelo, tamaño del cargador y si el gatillo está accionado.
     */
    public Rifle(String tipoDelRifle, int tamañoDelCargador) {
        tipoRifle = tipoDelRifle;
        tamañoCargador = tamañoDelCargador;
        gatilloAccionado = false;
    }
    
    /**
     * Devuelve el modelo del rifle.
     */
    public String getmodeloRifle() {
        return tipoRifle;
    }
    
    /**
     * Devuelve el tamaño del cargador del rifle.
     */
    public int gettamañoCargador() {
        return tamañoCargador;
    }
    
    /**
     * Devuelve el estado del gatillo del rifle.
     */
    public boolean getgatilloAccionado() {
        return gatilloAccionado;
    }
    
    /**
     * Modifica el modelo del rifle.
     */
    public void settipoRifle(String nuevoTipo) {
        tipoRifle = nuevoTipo;
    }
    
    /**
     * Modifica el tamaño del cargador del rifle.
     */
    public void settamañoCargador(int ampliarTamaño) {
        tamañoCargador = tamañoCargador + ampliarTamaño;
    }
    
    /**
     * Modifica el estado del gatillo del rifle.
     */
    public void setgatilloAccionado(boolean gatilloAccionado) {
        this.gatilloAccionado = gatilloAccionado;
    }
    
    public void imprimirEstadoRifle() {
        System.out.println("Tipo del rifle: " + tipoRifle + " | Tamaño del cargador: " +
        tamañoCargador + " balas | Gatillo accionado: " + gatilloAccionado);
    }
    
    public String getEstadoRifle() {
        return "Tipo del rifle: " + tipoRifle + " | Tamaño del cargador: " +
        tamañoCargador + " balas | Gatillo accionado: " + gatilloAccionado;
    }
}
