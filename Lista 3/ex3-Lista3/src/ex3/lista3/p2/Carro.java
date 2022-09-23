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
public class Carro implements PegadaDeCarbono {
    private boolean motor;
    private String tipo_combustivel;
    private float quantCombustivelConsumido;
    private int marcha;
    
    Carro (String tipo_combustivel) {
        this.motor = false;
        this.tipo_combustivel = tipo_combustivel;
        this.marcha = 0;
        this.quantCombustivelConsumido = 0;
    }
    
    boolean getEstadoMotor() {
        return motor;
    }

    void ligaDesligaCarro(boolean liga_desliga) {
        this.motor = liga_desliga;
    }

    int getMarcha() {
        return marcha;
    }

    void trocaMarcha(int marcha) {
        if(marcha > -2 && marcha < 7) {
            this.marcha = marcha;
        } 
    }
    
    void consomeCombustivel(float quantCombustivelConsumido) {
        this.quantCombustivelConsumido += quantCombustivelConsumido; 
    }   
    
    @Override
     public float getPegadaDeCarbono(){
         if(tipo_combustivel.equals("gasolina")) {
             return (float) (2.3 * quantCombustivelConsumido);
         } else { // etanol
             return (float) (0.32 * quantCombustivelConsumido);
         }
     }
     
}
