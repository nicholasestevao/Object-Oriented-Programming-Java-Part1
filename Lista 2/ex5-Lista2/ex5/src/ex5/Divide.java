/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author isaac
 */
class Divide extends Operation {
           
    Divide(User user, Data data) {
        super(user, data, "Divide");
    }
    
    @Override
    void calculate(double a, double b) {
       putResult(a / b);
       showResult();
    } 
}
