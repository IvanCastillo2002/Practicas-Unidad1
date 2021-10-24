/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_usando_arreglos;

/**
 *
 * @author ivned
 */
public class EVA1_9_USANDO_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
    //1. UN ARREGLO DE ENTEROS
    int[]aiDatos = new int[10];
    //2. LLENAR CON VALORES
    //Arreglo: estructura de acceso aleatorio
//Indice:
//Primer elemento del arreglo: posicion 0
//Ultimo elemento del arreglo: posicion N  1 (N es el tamaño del arreglo)
//ACCESO A LOS VALORES:

for(int i=0; i<10; i++){
   aiDatos[i]= (int)(Math.random()*100); //Random -- valores ebtre 0.0 y 1.0 * 100
}

    //3. IMPRIMIR LOS VALORES
    for(int i=0; i<10; i++){
       System.out.print("[" + aiDatos[i] + "]");; //Random -- valores ebtre 0.0 y 1.0 * 100
}
   
   }
   
}
