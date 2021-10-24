/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_garbage_collector;

/**
 *
 * @author ivned
 */
public class EVA1_5_GARBAGE_COLLECTOR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      MiClase obj=new MiClase();
      System.out.println(obj);
      //ELIMINAMOS EL OBJETO
      obj=null;
      System.out.println(obj);
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
