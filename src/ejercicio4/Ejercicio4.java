package ejercicio4;

import co.edu.uniminuto.entity.Cotizacion;
import co.edu.uniminuto.entity.Vehiculo;
import javax.swing.JOptionPane;

public class Ejercicio4 {
    /*Un taller mecánico desea hacer cotizaciones de reparación de un vehículo, 
    *para ellos se necesitan los datos de los vehículos: la marca, modelo, 
    *color, año y motivo de reparación. Se debe pedir mano de obra del mecánico,
    *precio total de repuestos y gastos administrativos que es el 15% de la 
    *obra de mano + el precio total de repuestos. En la cotización se debe
    *imprimir los datos del vehículo y el detalle de la cotización y monto total
    */
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido, introduzca los datos del carro a reparar: ");
        String marca = JOptionPane.showInputDialog("Cual es la marca del vehiculo?");
        String modelo = JOptionPane.showInputDialog("Cual es el modelo del vehiculo?");
        String color = JOptionPane.showInputDialog("Cual es el color del vehiculo?");
        int año = Integer.parseInt(JOptionPane.showInputDialog("De que año es el vehiculo?"));
        String motivoReparacion = JOptionPane.showInputDialog("Cual es el defecto que tiene el vehiculo en este momento?");
        Vehiculo vehiculoReparar = new Vehiculo(marca, modelo, color, año, motivoReparacion);
        
        double costoManoObra = Double.parseDouble(JOptionPane.showInputDialog("Cual es el costo de la mano de obra segun la descripcion: "));
        Cotizacion cotizacionVehiculoReparar = new Cotizacion(costoManoObra);
        cotizacionVehiculoReparar.calculoRepuestos();
        cotizacionVehiculoReparar.calcularGastosAdministrativos();
        cotizacionVehiculoReparar.calculoMontoTotal();
        
        JOptionPane.showMessageDialog(null, vehiculoReparar.toString()+"\n"+cotizacionVehiculoReparar.toString());
    }
    
}
