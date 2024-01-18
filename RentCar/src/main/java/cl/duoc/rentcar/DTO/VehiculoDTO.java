package cl.duoc.rentcar.DTO;

import Services.VehiculoService;


public abstract class VehiculoDTO implements VehiculoService {
    public String patente;
    public double precioDiario;
    public int cantidadDias;
    public int diasArriendo;

    public VehiculoDTO() {
        super();
        this.patente = "";
        this.precioDiario = 0;
        this.cantidadDias = 0;
    }

    public VehiculoDTO(String patente, double precioDiario, int cantidadDias) {
        this.patente = patente;
        this.precioDiario = precioDiario;
        this.cantidadDias = cantidadDias;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
    
    public abstract void mostrarDatos();
    
    @Override
    public void mostrarBoleta(){
        
        double subtotal = precioDiario * cantidadDias;
        double descuento = calcularDescuento();
        double total = subtotal - descuento + (subtotal * IVA);
        
        System.out.println("Precio Diraio: "+ precioDiario);
        System.out.println("Dias de arriendo: "+ cantidadDias);
        System.out.println("Subtotal: $"+ subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA (19%): $"+ (subtotal * IVA));
        System.out.println("Total a pagar: $"+ total);
        System.out.println("==============================");
    }
    
    public double calcularDescuento(){
        return 0;
    }
}
