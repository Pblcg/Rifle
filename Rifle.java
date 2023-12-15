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
    public String getModeloRifle() {
        return tipoRifle;
    }
    
    /**
     * Devuelve el tamaño del cargador del rifle.
     */
    public int getTamañoCargador() {
        return tamañoCargador;
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
     * Modifica el tamaño del cargador del rifle.
     */
    public void setTamañoCargador(int ampliarTamaño) {
        tamañoCargador = tamañoCargador + ampliarTamaño;
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
            gatilloAc = "Sí";  
        } else {
            gatilloAc = "No";
        }
        System.out.println("Tipo del rifle: " + tipoRifle + " | Tamaño del cargador: " +
        tamañoCargador + " balas | Gatillo accionado: " + gatilloAc);
    }
    
    public String getEstadoRifle() {
        String gatilloAc = "";
        if(gatilloAccionado == true) {
            gatilloAc = "Sí";  
        } else {
            gatilloAc = "No";
        }
        return "Tipo del rifle: " + tipoRifle + " | Tamaño del cargador: " +
        tamañoCargador + " balas | Gatillo accionado: " + gatilloAc;
    }
}
