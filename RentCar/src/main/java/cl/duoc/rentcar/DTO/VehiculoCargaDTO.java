
package cl.duoc.rentcar.DTO;

public class VehiculoCargaDTO extends VehiculoDTO {
    private double capacidadCargaKilos;

    public VehiculoCargaDTO() {
        super();
        this.capacidadCargaKilos = 0;
    }

    public VehiculoCargaDTO(double capacidadCargaKilos) {
        this.capacidadCargaKilos = capacidadCargaKilos;
    }

    public VehiculoCargaDTO(double capacidadCargaKilos, String patente, double precioDiario, int cantidadDias) {
        super(patente, precioDiario, cantidadDias);
        this.capacidadCargaKilos = capacidadCargaKilos;
    }

    public double getCapacidadCargaKilos() {
        return capacidadCargaKilos;
    }

    public void setCapacidadCargaKilos(double capacidadCargaKilos) {
        this.capacidadCargaKilos = capacidadCargaKilos;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("===== VEHICULO DE CARGA =====");
        System.out.println("Patente: "+ patente);
        System.out.println("Capacidad de carga: "+ capacidadCargaKilos + "kilos");
    }
    
    @Override
    public double calcularDescuento(){
        return precioDiario * cantidadDias * DESCUENTO_CARGA;
    }
    
}
