/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_24_for_each;

/**
 *
 * @author ivned
 */
public class EVA1_24_FOR_EACH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[] iArreglo= new int[10];
      
      for (int i = 0; i < iArreglo.length; i++) {
         iArreglo[i]=100;
         
      }
      //FOR - EACH
      //VARIABLE QUE ALMACENA EL VALOR DE CADA POSICION: ARREGLO QUE VAMOS A LEER
      for(int temp: iArreglo){//va del primer elemento al ultimo
         System.out.print("["  +temp+ "]");
      }
      System.out.println("");
      //Declara y se ponen en el arreglo
      int[] iDatos= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      String [] sCadenas = new String[] {"Lunes" , "Martes" , "Miercoles" , "Jueves"};
      for (String sCadena : sCadenas) {
         System.out.println(sCadena);
      }   
      System.out.println("Un dia de la semana " + sCadenas[2]);
   } 
}
