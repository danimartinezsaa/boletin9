/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Tabla mul=new Tabla();
        int numero=1;
        
    while(numero!=0){
        System.out.println("Introduzca número:");
        numero=scan.nextInt();
        
        if(numero!=0)
        mul.tmul(numero);
    }    
        
        
    }
    
}
