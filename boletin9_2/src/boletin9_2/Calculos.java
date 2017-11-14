/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Calculos {
    Scanner scan=new Scanner(System.in);
    int num=0, suma=0;
    double producto=1;
    public void calcular(){
        
        
        for(byte i=10;i<=90;i++){
            suma=suma+i;
            producto=i*producto;
        }
        System.out.println("Suma: "+suma+"\nProducto: "+producto);
        
    
    }
}

