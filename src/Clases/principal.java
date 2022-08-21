
package Clases;

public class principal 
{
   public static void main(String[]args){
       
   Bebida bebida1 = new Bebida("Pepsi","Pepsi", 1.5);
   Bebida bebida2 = new Bebida("Fanta de Nranja","Falta",2);
   Comida comida1 = new Comida("Carne con Tomate",350);
   Comida comida2 = new Comida("Rissoto",100);
      Bebida bebida3 = new Bebida("Agua","FontBella", 1);
   Bebida bebida4 = new Bebida("Aquarius de Limon ","Aquarius",2.5);
   Comida comida3 = new Comida("Arroz con bocabante",500);
   Comida comida4 = new Comida("Huevos",4);
   
   
      System.out.println(bebida3.getNombre()+ "-" + bebida3.getMarca()+ "-" + bebida3.getCapacidad()+ "L.");
      System.out.println(comida4.getNombre()+ "-" + comida4.getCantidad()+ "unidades.");
   }
}