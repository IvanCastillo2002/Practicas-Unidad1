/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_arreglos;

/**
 *
 * @author ivned
 * Fecha creación: 13 octubre 2021
 */
public class EVA1_14_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
     int[] iArreglo=new int[3]; //12 bytes -- 3 enteros por 4 bytes
      System.out.println("Direccion de iArreglo= " + iArreglo);
  iArreglo[0]= 1000; 
  iArreglo[1]= 2000; 
  iArreglo[2]= 3000; 
 // iArreglo[3]= 3;// error: ArrayTrudex out ofbound --  Nos pasamos del limite del arreglo
      for (int i = 0; i < iArreglo.length; i++) {
         System.out.println("CUENTA (iArreglo)" +  i  + " = $" + iArreglo[i]);
      }
      //QUIERO UNCA COPIA DE LOS DATOS DEL ARREGLO
     // int[]iCopia=iArreglo; //¿ESTO ESTA BIEN PARA CREAR UNA COPIA DEL ARREGLO?
   int[] iCopia = new int[3];
      System.out.println("Direccion de iCopia= " + iCopia);
      for (int i = 0; i < iArreglo.length; i++) {
         iCopia[i]=iArreglo[i];
      }
      iCopia[0] = 100000;
      for (int i = 0; i < iArreglo.length; i++) {
         System.out.println("CUENTA (iCopia) " + i + "=$ " + iCopia[i]);
      }
   }
}
