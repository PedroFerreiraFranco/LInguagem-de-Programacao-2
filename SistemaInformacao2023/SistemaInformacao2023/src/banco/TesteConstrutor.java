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
public class TesteConstrutor {
    public static void main(String[] args) {
        Conta x = new Conta();
        Conta y = new Conta(4000);
        Conta z = new Conta(25000, 8700);
        
        
        System.out.println("Saldo da conta Z: " +z.getSaldo());
        System.out.println("Numero da conta Z: " + z.getNumero());
        System.out.println("Total de contas: " +Conta.getTotalContas());
    }
}
