/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author tulio
 */
public class DAOFuncionario { // Data Acess Object
   
    public List<Funcionario> getLista(){
        return Dados.listaFuncionario;
    }
    
    public boolean salvar(Funcionario obj){
        if(obj.getCodigoFuncionario()==null){
            Integer codigo = Dados.listaFuncionario.size() +1;
            obj.setCodigoFuncionario(codigo);
            Dados.listaFuncionario.add(obj);
        }
        return true;
    }
    
    public boolean remover(Funcionario obj){
        Dados.listaFuncionario.remove(obj);
        return true;
    }    

}
    

    
    
    

