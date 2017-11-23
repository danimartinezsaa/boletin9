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
public class SerieA{

    int numero;

    public SerieA(){

    }

    public SerieA(int numero){
        this.numero=numero;
    }

    public void sumarDos(int numero){
        int contador=0;

        for(int i=0; i<numero; i++){
            contador=contador+2;
            
            if(i==(numero-1)){
                System.out.println(contador);
            }else{
                System.out.print(contador+"+");
            }
        }
    }
}
