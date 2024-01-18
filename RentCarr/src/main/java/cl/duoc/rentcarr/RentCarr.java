package cl.duoc.rentcarr;

import cl.duoc.rentcarr.models.vehiculocarga;
import cl.duoc.rentcarr.models.vehiculopasajero;
import cl.duoc.rentcarr.service.IvehiculoService;
import cl.duoc.rentcarr.service.vehiculoService;

public class RentCarr {

    public static void main(String[] args) {
        vehiculocarga carga = new vehiculocarga();
        carga.setCantidaddias(12);
        carga.setCargakilos(34);
        carga.setPatente(12345);
        carga.setPrecioarriendo(100000);
        System.out.println(carga);
        
        vehiculopasajero pasajero = new vehiculopasajero();
        pasajero.setCantidaddias(13);
        pasajero.setCantidadpasajeros(45);
        pasajero.setPatente(12345);
        pasajero.setPrecioarriendo(100233);
        System.out.println(pasajero);
        
        IvehiculoService funcion = new vehiculoService();{
        funcion.Guardar(carga);
        funcion.Guardar(pasajero);
        
        funcion.ImprimirListado();
        
        funcion.Borrar(1);
        funcion.ImprimirListado();
        
        funcion.MostrarDetalleBoleta(carga);

        
        int valorIVA = IvehiculoService.IVA;
    }
    }
}
