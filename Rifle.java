public class Rifle {
    //Indica el modelo del Rifle
    private String tipoRifle;
    //Indica el tama�o del cargador
    private int tama�oCargador;
    //Indica si el gatillo est� accionado
    private boolean gatilloAccionado;
    
    /**
     * Crea un rifle con su modelo, tama�o del cargador y si el gatillo est� accionado.
     */
    public Rifle(String tipoDelRifle, int tama�oDelCargador) {
        tipoRifle = tipoDelRifle;
        tama�oCargador = tama�oDelCargador;
        gatilloAccionado = false;
    }
    
    /**
     * Devuelve el modelo del rifle.
     */
    public String getModeloRifle() {
        return tipoRifle;
    }
    
    /**
     * Devuelve el tama�o del cargador del rifle.
     */
    public int getTama�oCargador() {
        return tama�oCargador;
    }
    
    /**
     * Devuelve el estado del gatillo del rifle.
     */
    public boolean getGatilloAccionado() {
        return gatilloAccionado;
    }
    
    /**
     * Modifica el modelo del rifle.
     */
    public void setTipoRifle(String nuevoTipo) {
        tipoRifle = nuevoTipo;
    }
    
    /**
     * Modifica el tama�o del cargador del rifle.
     */
    public void setTama�oCargador(int ampliarTama�o) {
        tama�oCargador = tama�oCargador + ampliarTama�o;
    }
    
    /**
     * Modifica el estado del gatillo del rifle.
     */
    public void setGatilloAccionado() {
        if(gatilloAccionado == true) {
            gatilloAccionado = false;  
        } else {
            gatilloAccionado = true;
        }
    }
    
    public void imprimirEstadoRifle() {
        String gatilloAc = "";
        if(gatilloAccionado == true) {
            gatilloAc = "S�";  
        } else {
            gatilloAc = "No";
        }
        System.out.println("Tipo del rifle: " + tipoRifle + " | Tama�o del cargador: " +
        tama�oCargador + " balas | Gatillo accionado: " + gatilloAc);
    }
    
    public String getEstadoRifle() {
        String gatilloAc = "";
        if(gatilloAccionado == true) {
            gatilloAc = "S�";  
        } else {
            gatilloAc = "No";
        }
        return "Tipo del rifle: " + tipoRifle + " | Tama�o del cargador: " +
        tama�oCargador + " balas | Gatillo accionado: " + gatilloAc;
    }
}
