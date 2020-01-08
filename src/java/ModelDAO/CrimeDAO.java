/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;
import Model.Crime;
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
public class CrimeDAO {
    Connect cn = new Connect();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean add(Crime crime) {
       
        String sql = "INSERT INTO crime (local,tipo_crime,descricao,data,hora) VALUES ('" + crime.getLocal()+ "','" + crime.getTipo_crime() + "','" + crime.getDescricao() + "','" + crime.getData() + "','" + crime.getHora() + "')";
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
        String sql = "SELECT max(id_crime) FROM crime";
        int id=0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("max(id_crime)"); 
            }
        } catch (Exception e) {
        }
        return id;
    }
       public Crime listar_crime() {
           Crime crime = new Crime();
           int id = this.retornar_ultimiId();
        String sql = "SELECT * FROM crime where id_crime=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
          
            while (rs.next()) {
                crime.setTipo_crime(rs.getString("tipo_crime"));
                crime.setDescricao(rs.getString("local"));
                crime.setId(rs.getInt("id_crime"));
                crime.setData(rs.getString("data"));
                crime.setDescricao(rs.getString("descricao"));
                crime.setHora(rs.getString("hora"));
            }
        } catch (Exception e) {
        }
        return crime;
    }
}
