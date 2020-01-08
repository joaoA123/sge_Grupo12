/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Interfaces.CRUDA;
import Model.Arquivos;
import Model.Propietario;
import config.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

public class ArquivoDAO implements CRUDA {

    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Arquivos arq = new Arquivos();
    Arquivos ut = new Arquivos();

    @Override
    public List listar(int id) {
        ArrayList<Arquivos> list = new ArrayList<>();
        String sql = "SELECT * FROM arquivo WHERE id_prop=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Arquivos arq = new Arquivos();
                arq.setId(rs.getInt("id"));
                arq.setNome(rs.getString("nome"));
                arq.setTipo(rs.getString("tipo"));
                arq.setPreco(rs.getFloat("preco"));
                arq.setData(rs.getString("data"));
                arq.setId_arq(rs.getInt("id_arqui"));
                //arq.setId_arq(rs.getInt("id_arqui"));
                list.add(arq);
            }
        } catch (Exception e) {

        }

        return list;
    }

    @Override
    public Arquivos list(int id) {
        String sql = "SELECT * FROM arquivo where id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                arq.setId(rs.getInt("id"));
                arq.setNome(rs.getString("nome"));
                arq.setTipo(rs.getString("tipo"));
                arq.setPreco(rs.getFloat("preco"));
                arq.setData(rs.getString("data"));
                arq.setId_arq(rs.getInt("id_arqui"));
                arq.setCaminho(rs.getString("caminho"));
                arq.setFilename(rs.getString("filename"));
            }
        } catch (Exception e) {
        }
        return arq;
    }

    public Arquivos getidp(String nome, String email) {
        String sql = "SELECT * FROM arquivo where nome=" + nome + "AND email=" + email;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                arq.setId(rs.getInt("id_prop"));
                arq.setNome(rs.getString("nome"));
                arq.setTipo(rs.getString("tipo"));
                arq.setPreco(rs.getFloat("preco"));
                arq.setData(rs.getString("data"));
                arq.setId_arq(rs.getInt("id_arqui"));
            }
        } catch (Exception e) {
        }
        return arq;
    }

    @Override
    public boolean add(Arquivos ut) {
        String cam="C:";
        String filename="f";
        String sql = "INSERT INTO arquivo (nome, tipo, id_prop,preco,caminho,id_arqui,filename) VALUES ('" + ut.getNome() + "','" + ut.getTipo() + "','" + ut.getId_prop() + "','" + ut.getPreco() + "','"+cam+"','"+1+"','"+filename+"')";
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
    public boolean edit(Arquivos ut) {
        String sql = "UPDATE arquivo SET nome='" + ut.getNome() + "',preco='" + ut.getPreco() + "' WHERE id=" + ut.getId();
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
        String sql = "delete from arquivo where id=" + id;
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
        String sql = "SELECT * FROM arquivo";
        int id = 0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Propietario arq = new Propietario();
                id = rs.getInt("idprop");
            }
            String sqlupdate = "UPDATE arquivo SET id_arqui='" + ut.getNome() + "' WHERE idprop=" + id;
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

    @Override
    public boolean finalizar(Arquivos ut) {
        String sql = "UPDATE arquivo SET caminho='" + ut.getCaminho()+ "',id_arqui='" + ut.getId_arq()+ "',filename='"+ut.getFilename()+"' WHERE id=" + ut.getId();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }

        return false;
    }

    
    @Override
    public int retornaid(String nome, String tipo, float preco) {
        int id = 0;
        String sql = "SELECT * FROM arquivo where nome='" + nome + "' and tipo='" + tipo + "' ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
        }
        return id;
    }

 

}
