/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_c1;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Nombre de la clase nombre_a_elegir = new nombre_clase();
        Coche coche = new Coche();
        coche.setMarca("TOYOTA");
        System.out.println("Cual es tu marca:" + coche.getMarca());
        
        Coche c = new Coche(4,"CITROEN","C3");
        System.out.println(c);
        
        Coche c2 = new Coche(4,"TOYOTA", "CELICA");
        
        String marcaCoche = coche.getMarca();
        System.out.println("La marca es:" + marcaCoche);
        
        System.out.println(Coche.getContador());
    }
    
}
