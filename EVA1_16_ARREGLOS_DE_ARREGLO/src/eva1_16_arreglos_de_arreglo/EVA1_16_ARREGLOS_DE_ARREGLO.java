/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_de_arreglo;

/**
 *
 * @author ivned
 */
public class EVA1_16_ARREGLOS_DE_ARREGLO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
  //DECLARAR UN ARRGELO DE DIMENCIONES
   
   
   int[][] iMatriz=new int [3][3];
      System.out.println("Direccion de iMatriz" + iMatriz);
      System.out.println("Tamaño de la primer decision(filas):" + iMatriz.length);
      for (int i = 0; i < iMatriz.length; i++) { //FILAS
         System.out.println(iMatriz[i]);
      }
           }
   
}
