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
public class SerieB {
    
    int numero;
    
    public SerieB(){
       
    }
    
    public SerieB(int numero){
        this.numero=numero;
    }
    
    public void metodo(int numero){
        int var=1; byte u=2;
        for(int i=0;i<numero;i++){
            
            if(u==1 && i!=(numero-1)){
                System.out.print(var+"+");
                var++;
                u=0;
            }
            else if(u==0 && i!=(numero-1)){
                System.out.print(var+"-");
                var++;
                u=1;
            }
            else if(u==2){
                System.out.print("-");
                u=1;
            }
            else if(i==(numero-1)){
                System.out.println(var);
            }
        }
    }
}
