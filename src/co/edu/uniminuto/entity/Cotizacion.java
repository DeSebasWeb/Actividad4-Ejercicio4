package co.edu.uniminuto.entity;
import javax.swing.JOptionPane;
public class Cotizacion {
    /*Un taller mecánico desea hacer cotizaciones de reparación de un vehículo, 
    *para ellos se necesitan los datos de los vehículos: la marca, modelo, 
    *color, año y motivo de reparación. Se debe pedir mano de obra del mecánico,
    *precio total de repuestos y gastos administrativos que es el 15% de la 
    *obra de mano + el precio total de repuestos. En la cotización se debe
    *imprimir los datos del vehículo y el detalle de la cotización y monto total
    */
    private double costoManoObra;
    private double precioRepuestos;
    private double precioTotalRepuestos = 0;
  
    private double gastosAdministrativos;
    
    private double montoTotal;
    
    int cantRepuestos = 0;
    
    
    
    public Cotizacion(double costoManoObra) {
        this.costoManoObra = costoManoObra;
          
    }
    public void calculoRepuestos(){
        cantRepuestos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos repuestos ve necesarios incluir?"));
        for(int i =0; i<cantRepuestos;i++){
            precioRepuestos = Double.parseDouble(JOptionPane.showInputDialog("Cual es el valor del repuesto "+(i+1)+":"));
            precioTotalRepuestos = precioTotalRepuestos+precioRepuestos;
            
        }  
    }
    
    public void calcularGastosAdministrativos(){
        double porcentaje = 15.0;
        double porcentajeManoObra =(porcentaje/100)*costoManoObra;
        gastosAdministrativos = porcentajeManoObra+precioTotalRepuestos;
        
    }
    public void calculoMontoTotal(){
        montoTotal = gastosAdministrativos+costoManoObra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCotizacion: ");
        sb.append("\nEl costo de la mano de obra es: ").append(costoManoObra);
        sb.append("\nEl precio total de los repuestos: ").append(precioTotalRepuestos);
        sb.append("\nLos gastos administrativos son el 15% de la obra de mano + el precio total de repuestos: ").append(gastosAdministrativos);
        sb.append("\nEl valor total a pagar: ").append(montoTotal);
        sb.append(' ');
        return sb.toString();
    }

    public double getPrecioTotalRepuestos() {
        return precioTotalRepuestos;
    }

    public void setPrecioTotalRepuestos(double precioTotalRepuestos) {
        this.precioTotalRepuestos = precioTotalRepuestos;
    }

    public double getGastosAdministrativos() {
        return gastosAdministrativos;
    }

    public void setGastosAdministrativos(double gastosAdministrativos) {
        this.gastosAdministrativos = gastosAdministrativos;
    }
    
    
    
    
    
}
