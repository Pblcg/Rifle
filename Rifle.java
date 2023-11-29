public class Rifle {
    //Indica el modelo del Rifle
    private String modeloRifle;
    //Indica el tama�o del cargador
    private int tama�oCargador;
    //Indica si el gatillo est� accionado
    private boolean gatilloAccionado;
    
    /**
     * Crea un rifle con su modelo, tama�o del cargador y si el gatillo est� accionado.
     */
    public Rifle(String modeloDelRifle, int tama�oDelCargador) {
        modeloRifle = modeloDelRifle;
        tama�oCargador = tama�oDelCargador;
        gatilloAccionado = false;
    }
    
    /**
     * Devuelve el modelo del rifle.
     */
    public String getmodeloRifle() {
        return modeloRifle;
    }
    
    /**
     * Devuelve el tama�o del cargador del rifle.
     */
    public int gettama�oCargador() {
        return tama�oCargador;
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
     * Modifica el tama�o del cargador del rifle.
     */
    public void settama�oCargador(int ampliarTama�o) {
        tama�oCargador = tama�oCargador + ampliarTama�o;
    }
    
    /**
     * Modifica el estado del gatillo del rifle.
     */
    public void setgatilloAccionado(boolean gatilloAccionado) {
        this.gatilloAccionado = gatilloAccionado;
    }
}
