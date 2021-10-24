/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_promedios;

import java.util.Scanner;

/**
 *
 * @author ivned
 */
public class EVA1_18_PROMEDIOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input=new Scanner(System.in);
      int[][] aiGrupos;
      //Preguntar al usuario los grupos
      System.out.println("¿Cuantos Grupos Son?");
      int iNoGrupos=input.nextInt();
      //LOS GRUPOS REPRESENTAN LAS FILAS
      aiGrupos=new int[iNoGrupos][];
      for (int i = 0; i < aiGrupos.length; i++) {
         System.out.println("Para el grupo" + i + "¿Cuantos estudiantes son?");
int iNoEstu=input.nextInt();
aiGrupos[i]=new int [iNoEstu];
      }
      //VAMOS A PREGUNTAR LAS EDADES
      for (int i = 0; i < aiGrupos.length; i++) {//PRIMER DIMENSION FILAS GRUPOS
         for (int j = 0; j < aiGrupos[i].length; j++) { //SEGUNDA DIMENSION, PARA CADA GRUPO, CUANTOS ALUMNSO HAY
            System.out.print("[" + "]");//PRINT (Impresion en la misma linea)
         }
         System.out.println("");//PRINTLN(debe imprimir ybhacer esl salto de linea)
      }
   }
   
}
