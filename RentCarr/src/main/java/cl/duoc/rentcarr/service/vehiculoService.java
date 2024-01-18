package cl.duoc.rentcarr.service;

import cl.duoc.rentcarr.models.vehiculo;
import cl.duoc.rentcarr.models.vehiculocarga;
import cl.duoc.rentcarr.models.vehiculopasajero;
import java.util.ArrayList;
import java.util.List;


public class vehiculoService implements IvehiculoService {
    private List<vehiculo> lista;
 
    public vehiculoService(){
        this.lista = new ArrayList();
    }
    
    public void Guardar(vehiculo v){
        this.lista.add(v);
    }
    
    public void Editar(vehiculo v,int i){
        this.lista.add(i,v);
    }
    
    public void ImprimirListado(){
        System.out.println("==============");
        System.out.println("Lista De Vehiculos");
        for (vehiculo v : this.lista){
            System.out.println(v);
        }
        System.out.println("==============");
    }
    
    public int calcularIva(int valor){
        return valor * IVA / 100;
    }

    
    
    public void MostrarDetalleBoleta(vehiculo v) {
        int valorArriendo = v.getPrecioarriendo();
        int descuento = 0;

        if (v instanceof vehiculocarga) {
            descuento = valorArriendo * descuentoCarga / 100;
        } else if (v instanceof vehiculopasajero) {
            descuento = valorArriendo * descuentoPasajero / 100;
        }

        int iva = calcularIva(valorArriendo);
        int total = valorArriendo - descuento + iva;

        System.out.println("Detalle de la Boleta:");
        System.out.println("Valor de arriendo: $" + valorArriendo);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
    @Override
    public int ArriendoMayorIgualA7Dias() {
        int count = 0;
        for (vehiculo v : lista) {
            if (v.getCantidaddias() >= 7) {
                count++;
            }
        }
        return count;
    }
    @Override
    public void Borrar(int v) {
        this.lista.remove(v);
    }
}
