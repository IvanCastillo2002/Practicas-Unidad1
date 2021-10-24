/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author ivned
 * Fecha: 11 de Octubre del 2021
 */
public class EVA11_EJEMPLO_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   //primero preguntar el tamaño del grupo
    Scanner input=new Scanner(System.in);  
   System.out.println("Indica el tamaño del grupo");
   int iTama=input.nextInt();
   int aiEdades[]=new int[iTama];//declarar arreglo, tamaño iTama
   for (int i = 0; i < aiEdades.length; i++) {//Desde el primer elemento elemento(CERO) al ultimo(N - 1)
   System.out.println("Edad:");
   aiEdades[i]=input.nextInt();
      }
   //ACUMULADOR
   int iAcum = 0;
    for (int i = 0; i < aiEdades.length; i++) {//Desde el primer elemento elemento(CERO) al ultimo(N - 1)
   System.out.print("[" + aiEdades[i] + "]");
   iAcum= iAcum + aiEdades[i];//iAcum + = aiEdades[i];
    }
     double dProm =(double) iAcum/ (double)iTama; //aiEdades.length
      System.out.println("Promedio:" + dProm);
   
   }
    
}

 