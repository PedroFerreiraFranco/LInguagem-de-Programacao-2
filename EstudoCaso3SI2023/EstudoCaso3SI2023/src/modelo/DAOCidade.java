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
        String sql = "select * from cidade";
        List<Cidade> listaCidade = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cidade objCidade = new Cidade();
                objCidade.setCodigoCidade(rs.getInt("codCidade"));
                objCidade.setNomeCidade(rs.getString("nome"));
                objCidade.setUfCidade(rs.getString("uf"));
                listaCidade.add(objCidade);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+ex.getMessage());
        }
        return listaCidade;
    }
    
    public boolean incluir(Cidade obj) {
        String sql = "insert into cidade (nome,uf) values(?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCidade());
            pst.setString(2, obj.getUfCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade incluida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não incluida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no incluir do DAOCidade" + e.getMessage());
            
    }
    return false;
}
    
    public boolean alterar(Cidade obj) {
        String sql = "update cidade set nome=?,uf=? where codCidade=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCidade());
            pst.setString(2, obj.getUfCidade());
            pst.setInt(3, obj.getCodigoCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade alterada");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não alterada");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no alterar do DAOCidade" + e.getMessage());
            
    }
    return false;
}
    
    public boolean remover(Cidade obj) {
        String sql = "delete from cidade where codCidade=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodigoCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade removida");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não removida");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL no remover do DAOCidade" + e.getMessage());
            
    }
    return false;
}
 
    public boolean salvar(Cidade obj) {
        if (obj.getCodigoCidade() == null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }

    }
}
    

    
    
    

