package cl.duoc.rentcar;

import Services.Impl.GestorVehiculo;
import cl.duoc.rentcar.DTO.VehiculoCargaDTO;
import cl.duoc.rentcar.DTO.VehiculoDTO;
import cl.duoc.rentcar.DTO.VehiculoPasajerosDTO;

import java.util.List;



public class RentCar {
    public static void main(String[] args) {
        GestorVehiculo gestor = new GestorVehiculo();
        
        VehiculoCargaDTO vehiculoCarga2 = new VehiculoCargaDTO();
        VehiculoCargaDTO vehiculoCarga = new VehiculoCargaDTO();
        VehiculoPasajerosDTO vehiculoPasajeros = new VehiculoPasajerosDTO();
        
        vehiculoPasajeros.setCantidadDias(5);
        vehiculoPasajeros.setCantidadPasajeros(15);
        vehiculoPasajeros.setPatente("BSA24");
        vehiculoPasajeros.setPrecioDiario(12000);
        
        //Vehiculo mayor a 7 dias
        vehiculoCarga2.setCantidadDias(15);
        vehiculoCarga2.setCapacidadCargaKilos(123.23);
        vehiculoCarga2.setPatente("SFD43");
        vehiculoCarga2.setPrecioDiario(15000);
        
        //misma patente
        vehiculoCarga.setCantidadDias(15);
        vehiculoCarga.setCapacidadCargaKilos(123.23);
        vehiculoCarga.setPatente("SFD43");
        vehiculoCarga.setPrecioDiario(15000);
        
        gestor.agregarVehiculo(vehiculoCarga2);
        gestor.agregarVehiculo(vehiculoCarga);
        gestor.agregarVehiculo(vehiculoPasajeros);
        
        
        List<VehiculoDTO> vehiculos = gestor.obtenerVehiculos();
        for (VehiculoDTO vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
            vehiculo.mostrarBoleta();
        }

        int ArriendoMayorIgualA7Dias = gestor.ArriendoMayorIgualA7Dias();
        System.out.println("==============================");
        System.out.println("Cantidad de arriendo mayor a 7: " + ArriendoMayorIgualA7Dias);
        System.out.println("==============================");
    }
} 
