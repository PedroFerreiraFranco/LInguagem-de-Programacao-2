/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto2;

/**
 *
 * @author 17352499636
 */
public class Teste {
    public static void main(String[] args) {
        
    Caminhoneiro c2 = new Caminhoneiro("João Alvez", "07.164.355/0001", "354.165.459-96",2500.45);
    Viagem viagem2 = new Viagem("São Paulo", 4.5, 350.0);
    Carreta carreta2 = new Carreta("Carreta ct-7000");
    Clientes clientes2 = new Clientes("Pedro", c2, viagem2, carreta2);
    
    viagem2.valorViagem();  
    clientes2.visualizarImagem();
    
        
    }
    
    
}
