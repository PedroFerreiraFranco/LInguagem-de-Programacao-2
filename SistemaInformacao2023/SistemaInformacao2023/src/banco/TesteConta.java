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
public class TesteConta {
      public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(500);
        cc.deposita(500);
        cp.deposita(500);
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }  
}
