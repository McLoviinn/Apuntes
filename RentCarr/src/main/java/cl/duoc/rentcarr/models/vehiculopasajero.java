package cl.duoc.rentcarr.models;


public final class vehiculopasajero extends vehiculo {
    private int cantidadpasajeros;

    public vehiculopasajero(int cantidadpasajeros) {
        super();
        this.cantidadpasajeros = cantidadpasajeros;
    }
    public vehiculopasajero() {
        super();
        this.cantidadpasajeros = 0;
    }

    public vehiculopasajero(int cantidadpasajeros, int patente, int cantidaddias, int precioarriendo) {
        super(patente, cantidaddias, precioarriendo);
        this.cantidadpasajeros = cantidadpasajeros;
    }

    public int getCantidadpasajeros() {
        return cantidadpasajeros;
    }

    public void setCantidadpasajeros(int cantidadpasajeros) {
        this.cantidadpasajeros = cantidadpasajeros;
    }

    @Override
    public String toString() {
        return "*vehicul de pasajeros* " + "patente: " + super.getPatente() + ", cantida de dias:" + super.getCantidaddias() + ", precio de arriendo: " + super.getPrecioarriendo()+", Pasajeros: "+ this.cantidadpasajeros;
    }
    
    
}
