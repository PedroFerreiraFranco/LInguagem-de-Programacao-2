/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class TestePessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Pedro");
        p1.setIdade(19);
        
        System.out.println("é seu aniversário? \n[1]SIM\n[2]NÃO\nResposta:");
        int op = entrada.nextInt();
        
        if(op==1){
             p1.fazAniversario();
        }
        else{
            System.out.println("volte quando fizer aniversário");
        }
       
    }
}
