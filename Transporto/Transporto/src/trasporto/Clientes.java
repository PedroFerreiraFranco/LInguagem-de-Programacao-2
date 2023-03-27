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
public class Clientes {
    private String nome, CPF, rg;
    Caminhoneiro c1;
    Viagem viagem1;
    Carreta carreta1;

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
    
    Clientes(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1){
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
  }
    public void visualizarImagem(){
        System.out.println("Cliente: "+this.nome);
        System.out.println("Motorista: "+this.c1.getNome());
        System.out.println("Veiculo: "+this.carreta1.getModeloCarreta());
        System.out.println("Destino: "+this.viagem1.getDestino());
        System.out.println("Valor KM: "+this.viagem1.getValorKM()+" Distancia: "+this.viagem1.getDistancia());
        System.out.println("Valor Total Viagem: "+this.viagem1.getValorViagem());
    }
}
