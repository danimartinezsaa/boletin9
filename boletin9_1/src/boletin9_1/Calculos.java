/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Calculos {
    Scanner scan=new Scanner(System.in);
    
    public void calculos(){
        int numero;
        byte ceros=0,positivos=0,negativos=0;
        for(int i=0;i<9;i++){
           
           System.out.println("Introduzca número "+i);
           numero=scan.nextInt();
           
           if(numero==0)
               ceros++;
           else if(numero<0)
               negativos++;
           else
               positivos++; 
        }
        System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos+"\nceros: "+ceros);
    }
}
