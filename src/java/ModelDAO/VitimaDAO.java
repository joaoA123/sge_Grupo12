/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;
import Model.Crime_Vitima;
import Model.Vitima;
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
public class VitimaDAO {
     Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean add(Vitima vitima) {
       
        String sql = "INSERT INTO vitima (id_pessoa,estado,Bairro) VALUES ('" + vitima.getId_pessoa()+ "','" + vitima.getEstado() + "','" + vitima.getEstado() + "')";
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
        ArrayList<Vitima> list = new ArrayList<>();
        String sql = "SELECT * FROM vitima v inner join pessoa p on p.idpessoa=v.id_pessoa " ;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vitima vitima = new Vitima();
                
                vitima.setBI(rs.getString("bi"));
                vitima.setNome(rs.getString("nome"));
                vitima.setEstado(rs.getString("estado"));
                vitima.setBairro(rs.getString("Bairro"));
                vitima.setGenero(rs.getString("genero"));
                vitima.setDataNascimento(rs.getString("dataNascimento"));
               
                //arq.setId_arq(rs.getInt("id_arqui"));
                list.add(vitima);
            }
        } catch (Exception e) {

        }

        return list;
    }
     
       public boolean add_crime_vitima(Crime_Vitima cri) {
       
        String sql = "INSERT INTO crime_vitima (id_vitima,id_crime) VALUES ('" + cri.getId_vitima() + "','" + cri.getId_crime() + "')";
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
        String sql = "SELECT max(id_vitima) FROM vitima";
        int id=0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("max(id_vitima)"); 
            }
        } catch (Exception e) {
        }
        return id;
    }


}
