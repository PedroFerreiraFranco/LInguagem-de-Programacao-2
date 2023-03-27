/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 17352499636
 */
public class Clientes {
    private String nome, CPF, rg;
    Caminhoneiro c1;
    Viagem viagem1;
    Carreta carreta1;
    
    List<Viagem> listViagem = new ArrayList(); 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public Clientes(String nome, Caminhoneiro c1,Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1= carreta1;
        listViagem.add(viagem1);
    }
    public void visualizarImagem(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("Motorista: "+this.c1.getNome());
        for(Viagem viagem1 : listViagem){
            System.out.println("Destino: "+viagem1.getDestino());
            System.out.println("Valor KM: "+viagem1.getValorKM()+" Distância: "+viagem1.getDistancia());
            System.out.println("Valor Total Viagem: "+viagem1.getValorViagem());
            System.out.println("---------------------------------------");
        }
    }
    
}
