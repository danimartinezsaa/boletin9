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
public class SerieC{

    int num, num1, num2, suma;

    public SerieC(){

    }

    public SerieC(int numero){
        this.num=numero;
    }

    public void fibonacci(int numero){

        for(int i=0; i<numero; i++){
            if(i==0){
                num1=suma;
                suma++;
                System.out.print(0+",");
            }else{
                num2=num1;
                num1=suma;
                suma=num1+num2;
            }

            if(i==(numero-1)){
                System.out.print(suma);
            }else{
                System.out.print(suma+",");
            }
        }
    }
}
