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
public class Clientes {
    private String nome, CPF, rg;
    Caminhoneiro c2;
    Viagem viagem2;
    Carreta carreta2;

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
    
    Clientes(String nome, Caminhoneiro c2, Viagem viagem2, Carreta carreta2){
        this.nome = nome;
        this.c2 = c2;
        this.viagem2 = viagem2;
        this.carreta2 = carreta2;
  }
    public void visualizarImagem(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("Motorista: "+this.c2.getNome());
        System.out.println("Veiculo: "+this.carreta2.getModeloCarreta());
        System.out.println("Destino: "+this.viagem2.getDestino());
        System.out.println("Valor KM: "+this.viagem2.getValorKM()+" Distancia: "+this.viagem2.getDistancia());
        System.out.println("Valor Total Viagem: "+this.viagem2.getValorViagem());
    }
}
