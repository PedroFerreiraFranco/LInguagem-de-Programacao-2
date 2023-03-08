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
public class TestePorta {
    public static void main(String[] args) {
        Porta pr = new Porta();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaCor = new Scanner(System.in);
        
        pr.setDimensaoX(5);
        pr.setDimensaoY(10);
        pr.setDimensaoZ(2);
        pr.setCor("marrom");
        
        System.out.print("\nDeseja fechar a porta?\n[1]SIM\n[2]NÃO\nResposta:");
        int op = entrada.nextInt();
        
        if(op==2){
        pr.mostra();
        }else if(op==1){
           pr.fecha();
           pr.mostra();
        }
                
        System.out.print("\nDeseja pintar a porta?\n[1]SIM\n[2]NÃO\nResposta:");
        int opCor = entrada.nextInt();
        
         if(opCor==1){
             System.out.println("Escreva a cor que deseja colocar: ");
             pr.mudaCor(entradaCor.nextLine());
             pr.mostra();
    }else{
         pr.mostra();    
         }      
}
}
