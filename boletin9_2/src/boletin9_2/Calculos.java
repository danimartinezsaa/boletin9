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
    byte f=1;
    float producto=1;
    String seguir;
    public void calcular(){
    do{     
            System.out.println("Inserte número:");
            num=scan.nextInt();
            suma=suma+num;
            producto=producto*num;
            
            System.out.println("Desea seguir?");
            seguir=scan.next();
            switch(seguir){
                case "si": f=0;
                break;
                case "no": f=1;
                break;
                default: System.out.println("Error");
                break;
            }
            
    }while(f==0);

    System.out.println("Suma:"+suma+"\nProducto:"+producto);
    
    }
}

