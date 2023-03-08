/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaNome = new Scanner(System.in);
        Scanner entradaRG = new Scanner(System.in);
        Scanner entradaDepartamento = new Scanner(System.in);
        Scanner entradaData = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        f1.setNome(entradaNome.nextLine());
        
        System.out.print("\nDigite seu salario: ");
        f1.setSalario(entrada.nextDouble());
        
        System.out.print("\nDigite seu RG: ");
        f1.setRg(entradaRG.nextLine());
        
        System.out.print("\nDigite seu departamento: ");
        f1.setDepartamento(entradaDepartamento.nextLine());
        
        System.out.print("\nData de entrada: ");
        f1.setDataEntrada(entradaData.nextLine());
        
        System.out.print("\nPorcentagem da sua bonificação: ");
        f1.bonifica(entrada.nextDouble());
        
        f1.mostra();
   }
}
