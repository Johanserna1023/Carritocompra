
package Clases;


public class Comida {
  private  String nombre="";
  private double cantidad;

    public Comida(String nombre,double cantidad) {
        this.nombre=nombre;
        this.cantidad =cantidad ;
    }

    Comida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
