/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iván Eduardo Castillo Castro
 * Fecha de Creacion: 5/Octubre/2021
 */
public class EVA1_4_HEAP {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      MiClase obj=new MiClase();
      System.out.println(obj);
      MiClase obj2=new MiClase();
      System.out.println(obj2);
      EVA1_4_HEAP objHeap=new EVA1_4_HEAP();
      System.out.println(objHeap);
   }

   
   
}
class MiClase{ //NUEVO TIPO DE DATO -- TIPOS DE DATOS ABSTRACTOS
   private String mensaje;
   public MiClase(){
      mensaje="Hola Mundo";
   }
   //getter / setter   
   public String getMensaje(){
      return mensaje;
   }
   public void setMensaje(String mensaje){
      this.mensaje=mensaje;
   } 
}
