/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyecto;

/**
 *
 * @author divilover
 */
public class MiProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String nombre= "Juanita";
        int edad = 13;
        
        
        while(!validarEdad(edad)){
            edad=incrementarEdad(edad);
        }
            System.out.println("Licencia otorgada a " + nombre);
    
    }
   
    public static boolean validarEdad(int edad){
        if(edad>=18){
            System.out.println(edad + " Si es mayor :)");
            return true;
        }else{
            System.out.println(edad + " No es mayor :(");
            return false;
        }
    }
    
    public static int incrementarEdad(int edadAct){
        return edadAct+1;
    }
    
}
