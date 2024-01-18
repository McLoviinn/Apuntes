package cl.duoc.rentcarr.models;


public class vehiculo {
    private int patente;
    private int cantidaddias;
    private int precioarriendo;

    public vehiculo() {
        this.patente = 0;
        this.cantidaddias = 0;
        this.precioarriendo = 0;
    }

    public vehiculo(int patente, int cantidaddias, int precioarriendo) {
        this.patente = patente;
        this.cantidaddias = cantidaddias;
        this.precioarriendo = precioarriendo;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public int getCantidaddias() {
        return cantidaddias;
    }

    public void setCantidaddias(int cantidaddias) {
        this.cantidaddias = cantidaddias;
    }

    public int getPrecioarriendo() {
        return precioarriendo;
    }

    public void setPrecioarriendo(int precioarriendo) {
        this.precioarriendo = precioarriendo;
    }
    
    
}
