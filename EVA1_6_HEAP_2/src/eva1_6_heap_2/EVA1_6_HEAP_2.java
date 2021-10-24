/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_heap_2;

/**
 *
 * @author ivned
 */
public class EVA1_6_HEAP_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int valOrig =5;
      System.out.println("ValOrig en el main= " +valOrig);
      incrementa(valOrig);
      System.out.println("ValOrig despues de llamar a incrementar =" + valOrig);
   
   //DEMOSTRACION POR PASO DE REFERENCIA
   Prueba objPrueba=new Prueba();
      System.out.println("valor de la x= " + objPrueba.x);
      System.out.println("ObjPrueba en el main= " + objPrueba);
   
   
   
   
   
   }
   //PASO POR VALOR -- PASAMOS UNA COPIA DEL VALOR EN UNA VARIABLE (VARIIABLES LOCALES PRIMITIVOS)
   public static void incrementa(int val){
      val++; //incremetamos en uno val =val + 1; val+-1;
      System.out.println("VALOR EN INCREMENTA=" + val);
   }
   public static int incrementaQueSiFunciona(int val){
     val++;
      return val;
   }
           //PASO POR REFERENCIA -- PASAN LA DIRECCION EN MEMORIA DEL OBJETO (OBJETOS)
   public static void incrementaObj(Prueba val){
      System.out.println("Objeto en incrementa obj= " +val);
      val.x++;
   }
}
class Prueba{
   public int x=10;
}
