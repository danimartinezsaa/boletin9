/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Boletin9_5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        SerieA a=new SerieA();
        SerieB b=new SerieB();
        SerieC c=new SerieC();

        System.out.println("Inserte un número:");
        int numero=scan.nextInt();

        a.sumarDos(numero);
        b.cambiarSigno(numero);
        c.fibonacci(numero);

    }

}
