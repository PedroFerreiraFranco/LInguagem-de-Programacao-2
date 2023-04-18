/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 17352499636
 */
public class TesteExecoes01 {
    public static void main(String[] args) {
        Scanner entrada = null;
        try{
            entrada = new Scanner(new File("D:\\17352499636\\Documents\\LP2\\Programming-Language-2\\teste.txt"));
        }catch(FileNotFoundException ex){
            System.out.println("Erro ao abrir o arquivo"+ex.getMessage());
        }
        
        while(entrada.hasNextLine()){
            System.out.println(entrada.nextLine());
        }
    }
}
