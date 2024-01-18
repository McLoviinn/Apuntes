package cl.duoc.rentcarr.models;


public class vehiculocarga extends vehiculo{
    private int cargakilos;

    public vehiculocarga(int cargakilos) {
        super();
        this.cargakilos = cargakilos;
    }
    public vehiculocarga() {
        super();
        this.cargakilos = 0;
    }

    public vehiculocarga(int cargakilos, int patente, int cantidaddias, int precioarriendo) {
        super(patente, cantidaddias, precioarriendo);
        this.cargakilos = cargakilos;
    }

    public int getCargakilos() {
        return cargakilos;
    }

    public void setCargakilos(int cargakilos) {
        this.cargakilos = cargakilos;
    }

    @Override
    public String toString() {
        return "*vehicul de carga* " + "patente: " + super.getPatente() + ", cantida de dias:" + super.getCantidaddias() + ", precio de arriendo: " + super.getPrecioarriendo()+", Carga en Kilos: "+ this.cargakilos;
    }
    
    
    
}
