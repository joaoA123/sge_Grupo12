/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;
import Model.Crime_Criminoso;
import Model.Criminoso;
import Model.Pessoa;
import config.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Luis Silva
 */
public class CriminosoDAO {
     Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean add(Criminoso cri) {
       
        String sql = "INSERT INTO criminoso (id_pessoa,Apelido,Bairro) VALUES ('" + cri.getId_pessoa() + "','" + cri.getApelido() + "','" + cri.getBairro() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("erro");
        }
        return false;
    }
    public List listar() {
        ArrayList<Criminoso> list = new ArrayList<>();
        String sql = "SELECT * FROM criminoso c inner join pessoa p on p.idpessoa=c.id_pessoa " ;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Criminoso crime = new Criminoso();
                
                crime.setBI(rs.getString("bi"));
                crime.setNome(rs.getString("nome"));
                crime.setApelido(rs.getString("Apelido"));
                crime.setBairro(rs.getString("Bairro"));
                crime.setGenero(rs.getString("genero"));
                crime.setDataNascimento(rs.getString("dataNascimento"));
               
                //arq.setId_arq(rs.getInt("id_arqui"));
                list.add(crime);
            }
        } catch (Exception e) {

        }

        return list;
    }
    
       public boolean add_crime_criminoso(Crime_Criminoso cri) {
       
        String sql = "INSERT INTO crime_criminoso (id_criminoso,id_crime) VALUES ('" + cri.getId_criminoso() + "','" + cri.getId_crime() + "')";
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
        String sql = "SELECT max(id_criminoso) FROM criminoso";
        int id=0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("max(id_criminoso)"); 
            }
        } catch (Exception e) {
        }
        return id;
    }

    
}
