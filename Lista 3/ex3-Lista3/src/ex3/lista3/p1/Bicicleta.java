/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista3.p1;

/**
 *
 * @author isaac
 */
public class Bicicleta {
    private int cassetes;
    private int cassete_usado;
    private int coroas;
    private int coroa_usada;
    
    Bicicleta(int cassetes, int coroas) {
        this.cassetes = cassetes;
        this.coroas = coroas;
    }
    
    public int getVelocidades() {
        return cassetes * coroas;
    }
    
    public int getCasseteUsado() {
        return cassete_usado;
    }
    
    public int getCoroaUsada() {
        return coroa_usada;
    }
    
    public void sobeMarchaCassete(int qnt) {
        if(cassete_usado < cassetes) {
            cassete_usado += qnt;
            if(cassete_usado > cassetes) {
                cassete_usado = cassetes;
            } 
         } else {
            System.out.println("Ja esta no cassete maximo (" + String.valueOf(cassete_usado) + ")");
         }   
    }
    
    public void desceMarchaCassete(int qnt) {
        if(cassete_usado > 1) {
            cassete_usado -= qnt;
            if(cassete_usado < 1) {
                cassete_usado = 1;
            } 
         } else {
            System.out.println("Ja esta no cassete minimo (" + String.valueOf(cassete_usado) + ")");
         }   
    }
}
