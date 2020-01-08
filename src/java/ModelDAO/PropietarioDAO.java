/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Interfaces.CRUD;
import Model.Propietario;
import config.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELVIS JR
 */
public class PropietarioDAO implements CRUD {

    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Propietario arq = new Propietario();
    Propietario ut = new Propietario();

    @Override
    public List listar() {
        ArrayList<Propietario> list = new ArrayList<>();
        String nomes="elvino12@hotmail.com";
        int senha=123;
        String sql = "SELECT * FROM propietario";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
               /* $rest = $statement->fetchAll(PDO::FETCH_OBJ);

                foreach($rest as $reste){
                    $nome=$reste->nome_rest;
                $id_rest=$reste->id_rest;
    }*/
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Propietario arq = new Propietario();
                arq.setId(rs.getInt("idprop"));
                arq.setNome(rs.getString("nome"));
                arq.setEmail(rs.getString("email"));
                arq.setSenha(rs.getString("password"));
                list.add(arq);
            }
        } catch (Exception e) {

        }

        return list;
    }

    @Override
    public Propietario list(int id) {
        String sql = "SELECT * FROM propietario where idprop=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                arq.setId(rs.getInt("idprop"));
                arq.setNome(rs.getString("nome"));
                arq.setEmail(rs.getString("email"));
                arq.setSenha(rs.getString("password"));
            }
        } catch (Exception e) {
        }
        return arq;
    }

    public Propietario getidp(String nome, String email) {
        String sql = "SELECT * FROM propietario where nome="+nome+"AND email="+email;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                arq.setId(rs.getInt("idprop"));
                arq.setNome(rs.getString("nome"));
                arq.setEmail(rs.getString("email"));
                arq.setSenha(rs.getString("password"));
            }
        } catch (Exception e) {
        }
        return arq;
    }

    @Override
    public int getid(String email, String senha) {
        int idporp=0;
        
        String sql = "SELECT * FROM propietario where email='"+email+"' and password='"+senha+"'";
        
	 try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idporp=rs.getInt("idprop");
            }
        } catch (Exception e) {
        }
        return idporp;
    }

    @Override
    public boolean add(Propietario ut) {
        String sql = "INSERT INTO propietario (nome, email, password) VALUES ('" + ut.getNome() + "','" + ut.getEmail() + "','" + ut.getSenha() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("erro");
        }
        return false;
    }

    @Override
    public boolean edit(Propietario ut) {
        String sql = "UPDATE propietario SET nome='" + ut.getNome() + "',email='" + ut.getEmail() + "',password='" + ut.getSenha() + "' WHERE idprop=" + ut.getId();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }

        return false;
    }

    @Override
    public boolean delet(int id) {
        String sql = "delete from propietario where idprop=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean act(int a) {
        String sql = "SELECT * FROM propietario";
        int id = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Propietario arq = new Propietario();
                id = rs.getInt("idprop");
            }
            String sqlupdate = "UPDATE propietario SET id_arqui='" + ut.getNome() + "',email='" + ut.getEmail() + "',password='" + ut.getSenha() + "' WHERE idprop=" + ut.getId();
            try {
                con = cn.getConnection();
                ps = con.prepareStatement(sqlupdate);
                ps.executeUpdate();
            } catch (Exception e) {

            }

        } catch (Exception e) {

        }

        return false;
    }

}
