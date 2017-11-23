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
public class SerieB{

    int numero;

    public SerieB(){

    }

    public SerieB(int numero){
        this.numero=numero;
    }

    public void cambiarSigno(int numero){
        int contador=1;
        byte interruptor=2;
        for(int i=0; i<numero; i++){

            if(interruptor==1&&i!=(numero-1)){
                System.out.print(contador+"+");
                contador++;
                interruptor=0;
            }else if(interruptor==0&&i!=(numero-1)){
                System.out.print(contador+"-");
                contador++;
                interruptor=1;
            }else if(interruptor==2){
                System.out.print("-");
                interruptor=1;
            }else if(i==(numero-1)){
                System.out.println(contador);
            }
        }
    }
}
