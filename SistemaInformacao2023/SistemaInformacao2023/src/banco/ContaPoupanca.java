/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author pedro
 */
public class ContaPoupanca extends Conta {
    
    @Override
    void atualiza(double taxa){ 
        deposita(this.getSaldo() * taxa * 3);
    }
    
}
