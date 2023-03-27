/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto2;

import java.util.List;

/**
 *
 * @author 17352499636
 */
public class Teste {
    public static void main(String[] args) {
        
    Caminhoneiro caminhoneiro = new Caminhoneiro("João Alvez", "07.164.355/0001", "354.165.459-96",2500.45);
    Carreta carreta = new Carreta("Carreta ct-7000");
    
    
    Viagem viagem = new Viagem("São Paulo", 4.5, 350.0);
    Viagem viagem2 = new Viagem("Machado", 5, 700.0);
    Viagem viagem3 = new Viagem("Rio Branco", 4.85, 4200.0);
    Viagem viagem4 = new Viagem("Rio de Janeiro", 5, 700.0);   
    
    Clientes clientes = new Clientes("Pedro", caminhoneiro, viagem, carreta);
    
    clientes.listViagem.add(viagem2);
    clientes.listViagem.add(viagem3);
    clientes.listViagem.add(viagem4);
    
    clientes.visualizarImagem();
    
        
    }
    
    
}
