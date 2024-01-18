package Services.Impl;

import cl.duoc.rentcar.DTO.VehiculoDTO;
import java.util.ArrayList;
import java.util.List;


public class GestorVehiculo {
    private final List<VehiculoDTO> vehiculos = new ArrayList<>();
    
    
    public void agregarVehiculo(VehiculoDTO vehiculo) {
        if (existeVehiculoPorPatente(vehiculo.patente)) {
        System.out.println("==============================");
        System.out.println("Esta patente: " + vehiculo.patente + " ya existe.");
            System.out.println("==============================");
        } else {
        vehiculos.add(vehiculo);
        }
    }

    public List<VehiculoDTO> obtenerVehiculos() {
        return vehiculos;
    }
    
    public int ArriendoMayorIgualA7Dias() {
        int contador = 0;
        for (VehiculoDTO vehiculo : vehiculos) {
            if (vehiculo.getCantidadDias()>= 7) {
            contador++;
            }
        }
        return contador;
    }

    public boolean existeVehiculoPorPatente(String patente) {
        for (VehiculoDTO vehiculo : vehiculos) {
        if (vehiculo.patente.equals(patente)) {
            return true;
        }
    }
    return false;
}

}
