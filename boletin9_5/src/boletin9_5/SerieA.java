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
public class SerieA {
    
    int numero;
    
    public SerieA(){
        
    }
    
    public SerieA(int numero){
        this.numero=numero;
    }
    
    public void metodo(int numero){
        int var=0;
        for(int i=0;i<numero;i++){
            var=var+2;
            if(i==(numero-1))
                System.out.println(var);
            else 
                System.out.print(var+"+");
        }
    }
}
