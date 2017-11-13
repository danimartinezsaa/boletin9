/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

/**
 *
 * @author dani
 */
public class SerieC {
    int numero, guardar,guardar2, suma;
    
    public SerieC(){
        
    }
    
    public SerieC(int numero){
        this.numero=numero;
    }
    
    public void metodo(int numero){
        
        for(int i=0;i<numero;i++){
            if(i==0){
                guardar=suma;
                suma++;
                System.out.print(0+",");
            }
            else
            {   
                guardar2=guardar;
                guardar=suma;
                suma=guardar+guardar2;
            }
            
            if(i==(numero-1))
                System.out.print(suma);
            else
            System.out.print(suma+",");
    }
}
}