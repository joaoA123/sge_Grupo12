
package config;

import java.sql.*;

public class Connect {
    Connection con;
    public Connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sgeuan","root","");
        }catch(Exception e){
            System.err.println("Erro "+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
