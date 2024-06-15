package co.edu.uniminuto.entity;
public class Vehiculo {
    /*Un taller mecánico desea hacer cotizaciones de reparación de un vehículo, 
    *para ellos se necesitan los datos de los vehículos: la marca, modelo, 
    *color, año y motivo de reparación. Se debe pedir mano de obra del mecánico,
    *precio total de repuestos y gatos administrativos que es el 15% de la 
    *obra de mano + el precio total de repuestos. En la cotización se debe
    *imprimir los datos del vehículo y el detalle de la cotización y monto total
    */
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private String motivoReparacion;

    public Vehiculo(String marca, String modelo, String color, int año, String motivoReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoReparacion = motivoReparacion;
    }

    public String getMotivoReparacion() {
        return motivoReparacion;
    }

    public void setMotivoReparacion(String motivoReparacion) {
        this.motivoReparacion = motivoReparacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo: ");
        sb.append("\nMarca: ").append(marca);
        sb.append("\nModelo: ").append(modelo);
        sb.append("\nColor: ").append(color);
        sb.append("\nAño: ").append(año);
        sb.append("\nEl motivo de la reparacion: ").append(motivoReparacion);
        sb.append(' ');
        return sb.toString();
    }
    
    
    
}
