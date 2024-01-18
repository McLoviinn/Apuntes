package cl.duoc.rentcarr.service;

import cl.duoc.rentcarr.models.vehiculo;

public interface IvehiculoService {
    public static final int IVA = 19;
    public static final int descuentoCarga = 3;
    public static final int descuentoPasajero = 7;
    
    public void Guardar(vehiculo v);
    public void Borrar(int v);
    public void ImprimirListado();
    public void MostrarDetalleBoleta(vehiculo v);
    int ArriendoMayorIgualA7Dias();
}
