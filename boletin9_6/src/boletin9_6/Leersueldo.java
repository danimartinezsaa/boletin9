/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Leersueldo {
    Scanner scan=new Scanner(System.in);
    byte var=0,n1=0;
    float sueldo,porcentaje,n2,n3;
    
    public void metodo(){
        while(var==0){
            
            System.out.println("Introduzca sueldo:");
            sueldo=scan.nextFloat();
            
            if(sueldo>=1000 && sueldo<=1750){
                n1++;
                n3++;
            }
            else if(sueldo<1000 && sueldo>0){
                n2++;
                n3++;
            }
            else if (sueldo==0)
                var=1;
            else;
        }
        
        System.out.println("Nº que ganan entre 1000 y 1750:"+n1);
        System.out.println("Nº que ganan menos de 1000:"+n2);
        System.out.println("% que ganan menos 1000:"+((n2/n3)*100));
    }
    
}
