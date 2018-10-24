/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author Samuel
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta cuenta = new Conta(){};
       
       
       cuenta.setDinero(15000);
       cuenta.setNome("samuel"); //A los String hay que darles el valor entre comillas
       cuenta.setNumConta("21211");
       cuenta.amosar();
   
       
       Conta cont1=new Conta("Pepe","34821",54238){};
       cont1.amosar();
    }
               
       
     
          
   
    
}
