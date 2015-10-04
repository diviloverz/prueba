/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author divilover
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Elevador elevadorChico= new Elevador(400,5);
        
       /* System.out.println("elevadorChico "+elevadorChico.pesoMaximo+" capacidadMaxPersonas "+elevadorChico.capacidadMaxPersonas);
      
        Elevador elevadorGrande= new Elevador(800,10);
        
         System.out.println("elevadorGrande "+elevadorGrande.pesoMaximo+" capacidadMaxPersonas "+elevadorGrande.capacidadMaxPersonas);
    
         System.out.println("Soy elevadorChico");
         elevadorChico.abrirPuertas();
         
         int piso=elevadorChico.bajarPiso(6);
         System.out.println(piso);
               
        
        System.out.println(elevadorChico);
        Elevador otroElevador=elevadorChico;
        System.out.println(otroElevador);
    
        
        System.out.println("peso"+elevadorChico.capacidadMaxPersonas);
        System.out.println("peso"+otroElevador.capacidadMaxPersonas);
        
        elevadorChico.capacidadMaxPersonas=7;
        
         System.out.println("peso"+elevadorChico.capacidadMaxPersonas);
        System.out.println("peso"+otroElevador.capacidadMaxPersonas);
               */
      /*  
        System.out.println(elevadorChico.getCapacidadMaxPersonas());
        elevadorChico.setPesoMaximo(700);
        System.out.println(elevadorChico.getPesoMaximo());
      */
        
        
        /*ElevadorAutos ea =new ElevadorAutos(400,5);
        
        System.out.println(ea.subirPiso(12));
        ea.abrirPuertas();
                */
        
        Animal animal=new Animal();
        animal.desplazarse();
        
        
        Pez pez=new Pez();
        pez.desplazarse();
        
       
       Ave ave=new Ave();
       ave.desplazarse();
       
       
       MamiferoTerrestre mt=new MamiferoTerrestre();
       mt.desplazarse();
    }
    
    public static void DesplazarAnimal(Animal a){
        a.desplazarse();
    }
    
}
