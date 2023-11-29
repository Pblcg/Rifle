public class Rifle {
    //Indica el modelo del Rifle
    private String modeloRifle;
    //Indica el tamaño del cargador
    private int tamañoCargador;
    //Indica si el gatillo está accionado
    private boolean gatilloAccionado;
    
    /**
     * Crea un rifle con su modelo, tamaño del cargador y si el gatillo está accionado.
     */
    public Rifle(String modeloDelRifle, int tamañoDelCargador) {
        modeloRifle = modeloDelRifle;
        tamañoCargador = tamañoDelCargador;
        gatilloAccionado = false;
    }
    
    /**
     * Devuelve el modelo del rifle.
     */
    public String getmodeloRifle() {
        return modeloRifle;
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
    public void setmodeloRifle(String nuevoModelo) {
        modeloRifle = nuevoModelo;
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
}
