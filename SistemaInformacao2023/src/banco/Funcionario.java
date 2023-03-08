/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Pedro
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private Double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo = true;
    
    public void mostra(){
        System.out.println("\n***********\n");
        System.out.println("Nome: "+this.getNome());
        System.out.println("RG: "+this.getRg());
        System.out.println("Departamento: "+this.getDepartamento());
        System.out.println("Data de entrada: "+this.getDataEntrada());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Funcionario ativo?: "+this.isAtivo());
    }
    
    public void bonifica(double valor){
    this.salario = this.salario+(salario*(valor/100));  
}
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    public void demite(){
        this.setAtivo(false);
    }


}
