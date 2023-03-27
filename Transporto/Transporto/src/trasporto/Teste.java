/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto;

/**
 *
 * @author 17352499636
 */
public class Teste {
    public static void main(String[] args) {
        
    Caminhoneiro c1 = new Caminhoneiro("João Alvez", "07.164.355/0001", "354.165.459-96",2500.45);
    Viagem viagem1 = new Viagem("São Paulo", 4.5, 350.0);
    Carreta carreta1 = new Carreta("Carreta ct-7000");
    Clientes clientes1 = new Clientes("Pedro", c1, viagem1, carreta1);
    
    viagem1.valorViagem();  
    clientes1.visualizarImagem();
    
        
    }
    
    
}
