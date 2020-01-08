/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Model.Pessoa;
import config.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luis Silva
 */
public class PessoaDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean add(Pessoa pessoa) {
       
        String sql = "INSERT INTO pessoa (nome,dataNascimento,genero,imagem,BI) VALUES ('" + pessoa.getNome() + "','" + pessoa.getDataNascimento() + "','" + pessoa.getGenero() + "','" + pessoa.getImagem() + "','" + pessoa.getBI() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("erro");
        }
        return false;
    }
      public int retornar_ultimiId() {
        String sql = "SELECT max(idpessoa) FROM pessoa";
        int id=0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("max(idpessoa)"); 
            }
        } catch (Exception e) {
        }
        return id;
    }
}
