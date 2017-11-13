/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

/**
 *
 * @author dani
 */
public class Area {
    float base, altura;
    
    public Area(){
        
    }
    
    public Area(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcular(float base, float altura){
        float area=base*altura;
        return area;
    }
}
