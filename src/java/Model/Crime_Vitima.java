/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luis Silva
 */
public class Crime_Vitima {
      int id_crime;
      int id_vitima;
      
         public Crime_Vitima() {
        
    }

    public Crime_Vitima(int id_crime, int id_vitima) {
        this.id_crime = id_crime;
        this.id_vitima = id_vitima;
    }
      

    public int getId_crime() {
        return id_crime;
    }

    public void setId_crime(int id_crime) {
        this.id_crime = id_crime;
    }

    public int getId_vitima() {
        return id_vitima;
    }

    public void setId_vitima(int id_vitima) {
        this.id_vitima = id_vitima;
    }
      
}
