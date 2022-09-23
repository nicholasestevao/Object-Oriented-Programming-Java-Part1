/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista3.p2;

import ex3.lista3.p1.*;

/**
 *
 * @author isaac
 */
public class Predio implements PegadaDeCarbono {
     
    float consumo_energia;
    float porcentagem_energia_limpa;
    
    Predio(float porcentagem_energia_limpa) {
       this.consumo_energia = 0;
       this.porcentagem_energia_limpa = porcentagem_energia_limpa;
    }
    
    void consomeEnergia(float cosumo_energia) {
        this.consumo_energia += consumo_energia;
    }
    
    @Override
    public float getPegadaDeCarbono(){
        return (float) ((1-porcentagem_energia_limpa) * consumo_energia * 100);
    }
    
}
