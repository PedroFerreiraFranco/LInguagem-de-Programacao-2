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
public class Casa {
    private String cor;
    Porta p1 = new Porta();
    Porta p2 = new Porta();
    Porta p3 = new Porta();
    int qtd=0;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int quantasPortasEstaoAbertas(){
        if(p1.isAberta()){
            qtd++;
        }
        if(p2.isAberta()){
            qtd++;
        }
        if(p3.isAberta()){
            qtd++;
        }
        return qtd;
    }
    
    public void mudaCor(String corDesejada){
        setCor(corDesejada);
    }

    
}
