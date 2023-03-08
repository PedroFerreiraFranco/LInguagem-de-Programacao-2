/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Pedro
 */
public class TesteCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        int qtdCasa=0;
        
        casa.setCor("rosa");
        casa.p1.fecha();
        qtdCasa= casa.quantasPortasEstaoAbertas();
        System.out.println("Quantidade de portas abertas: "+qtdCasa);
        System.out.println("Nova cor da casa: "+casa.getCor());
        casa.mudaCor("azul");
        System.out.println("Nova cor da casa: "+casa.getCor());
        
    }
}
