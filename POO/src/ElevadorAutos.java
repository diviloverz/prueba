/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author divilover
 */
public class ElevadorAutos extends Elevador {
    
    //constructor
    public ElevadorAutos(int pm, int c){
        super(pm,c);
    }
    
    private int capacidadAutos;
    
    public void proporcionargasolina(){
        System.out.println("Estoy proporcionando gasolina");
    } 
    
    public int getCapacidadAutos(){
    return capacidadAutos;
}
    public void setCapacidadAutos(int ca){
        capacidadAutos=ca;
    }
    
    
}
