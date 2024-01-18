package cl.duoc.rentcar.DTO;


public class VehiculoPasajerosDTO extends VehiculoDTO {
    private int cantidadPasajeros;

    public VehiculoPasajerosDTO() {
        super();
        this.cantidadPasajeros = 0;
    }

    public VehiculoPasajerosDTO(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public VehiculoPasajerosDTO(int cantidadPasajeros, String patente, double precioDiario, int cantidadDias) {
        super(patente, precioDiario, cantidadDias);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
    @Override
    public void mostrarDatos(){
        System.out.println("=== VEHICULO DE PASAJEROS === ");
        System.out.println("Patente: " + patente);
        System.out.println("Cantidad de pasajeros: "+ cantidadPasajeros);
    }
    
    @Override
    public double calcularDescuento(){
        return precioDiario * cantidadDias * DESCUENTO_PASAJEROS;
    }
}
