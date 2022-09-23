/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista3.p1;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Ex3Lista3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float pegada_carbono = (float)(0.0);
        
        Predio p = new Predio((float)(0.5));
        Bicicleta b = new Bicicleta(7, 3);
        Carro c = new Carro("gasolina");
        ArrayList<PegadaDeCarbono> pc = new ArrayList();
        
        pc.add(p);
        pc.add(b);
        pc.add(c);
        
        p.consomeEnergia((float)(10000.648));
        b.andar((float)(10.77));
        c.consomeCombustivel((float)(50.8));
        
        
        for(int i = 0; i< pc.size(); i++){
            pegada_carbono += pc.get(i).getPegadaDeCarbono();
        }
        
        System.out.println("Pegada de Carbono: " +pegada_carbono + " kgCO2eq");
        
    }
    
}
