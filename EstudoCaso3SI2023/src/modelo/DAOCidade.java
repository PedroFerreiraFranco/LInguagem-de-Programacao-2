/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 */
public class DAOCidade { // Data Acess Object
   
    public List<Cidade> getLista(){
        String sql = "select = from cidade";
        List<Cidade> ListaCidade = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cidade objeCidade = new Cidade();
                objeCidade.setCodigoCidade(rs.getInt("codCidade"));
                objeCidade.setNomeCidade(rs.getString("nome"));
                objeCidade.setUfCidade(rs.getString("uf"));
                ListaCidade.add(objeCidade);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ex.getMessage());
        }
        return ListaCidade;
    }
    
    public boolean salvar(Cidade obj){
        if(obj.getCodigoCidade()==null){
            Integer codigo = Dados.listaCidade.size() +1;
            obj.setCodigoCidade(codigo);
            Dados.listaCidade.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cidade obj){
        Dados.listaCidade.remove(obj);
        return true;
    }    

}
    

    
    
    

