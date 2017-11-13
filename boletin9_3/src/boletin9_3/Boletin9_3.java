/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       Area rectangulo=new Area();
       float base, altura, area=0;
       byte f=1;
       
       do{
           
        System.out.println("Introduzca base:");
        base=scan.nextFloat();
        System.out.println("Introduzca altura:");
        altura=scan.nextFloat();
        
        
        if(base>=0 && altura>=0){
            area=rectangulo.calcular(base, altura);
            f=0;
        }
        else
            System.out.println("Inserte dos números positivos.");
            
       }while(f==1);
       
        System.out.println("Área = "+area);
    }
    
}
