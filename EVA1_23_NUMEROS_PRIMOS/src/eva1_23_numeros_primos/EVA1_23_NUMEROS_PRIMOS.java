/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author ivned
 */
public class EVA1_23_NUMEROS_PRIMOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
  Scanner input=new Scanner(System.in);
      System.out.println("Introduce el numero: ");
      int iVal=input.nextInt();
      boolean esPrimo = true;
      for (int i = 2; i < iVal; i++) {
         //DIVISION: ival / i  >DIVISION EXACTA -- NO ES PRIMO
         // MODULO --> CALCULA EL RESIDUO DE LA DIVISION
         //JAVA EL MODULO ES % -->NUM1 % NUM2
         //7%5 = 2 DIVISION CON RESIDUO
         //15 % 3 = 0 DIVISION EXACTA
         int iMod = iVal % i;
         if(iMod ==0){// modulo diferente de cero
         // modulo es igual a cero, no es primo, hay que terminar
        esPrimo=false;
         break;//DETIENE PERMANENTEMENTE EL FOR
      }
         //Si la division es exacta --> terminamos NO ES PRIMO
         //Si terminamos el for sin dividir exactamente: es Primo
   }
      //IMPRIMIR SI ES PRIMO O NO 
   if(esPrimo)
         System.out.println("El numero es primo");
   else
         System.out.println("El numero no es primo");
}
}
