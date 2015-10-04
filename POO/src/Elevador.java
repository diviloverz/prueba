/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author divilover
 */
public class Elevador {
    private int pesoMaximo;
    private int capacidadMaxPersonas;
    
    //constructor
    public Elevador(int pm,int c){
        pesoMaximo=pm;
        capacidadMaxPersonas=c;
    }
    
    public int subirPiso(int pisoActual){
        int nuevoPiso=pisoActual+1;
        return nuevoPiso;
    }
    
    public int bajarPiso (int pisoActual){
        int nuevoPiso=pisoActual-1;
        return nuevoPiso;
    }
    
    public void abrirPuertas(){
        System.out.println("Estoy abriendo puertas");
    }
    
    public void cerrarPuertas(){
        System.out.println("Estoy cerrando puertas");
    }
    
    public int getPesoMaximo(){
        return pesoMaximo;
    }
    
    public int getCapacidadMaxPersonas(){
        return capacidadMaxPersonas;
    }
    
    public void setPesoMaximo(int pm){
        pesoMaximo=pm;
    }
    
    public void setCapacidadMaxPersonas(int c){
        capacidadMaxPersonas=c;
    }
}
