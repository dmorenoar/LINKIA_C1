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
public class Coche {
    //Definición de variables
    private int numRuedas;
    private String marca;
    private String modelo;
    static int contador;
    
    public Coche(){}
    
    public Coche(int numRuedas, String marca, String modelo){
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.modelo = modelo;
        arrancar();
        contador++;
        //Aquí pondría un contador
    }
    //Getters y Setters
    /*
      tipo_de_encapsulación(private,public..) tipo_dato_devuelve(int,String,void..) 
    nombre_metodo(tipo_parametro param1, tipo_parametro param2)  
    */
    //Al declarar que el método devuelve un int nos vemos obligados a hacer un return
    public int getNumRuedas(){
        return this.numRuedas;
    }
    //No nos obliga a hacer un return porque void indica que no devuelva nada
    //this significa el atributo propio de la clase
    public void setNumRuedas(int numRuedas){
        this.numRuedas = numRuedas;
    } 
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public static void arrancar(){
        System.out.println("Arrancoooo");
    }

    @Override
    public String toString() {
        return "Coche{marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    public static int getContador(){
        return Coche.contador;
    }
    
}
