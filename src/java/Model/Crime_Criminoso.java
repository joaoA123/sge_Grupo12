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
public class Crime_Criminoso {
   int id_crime;
   int id_criminoso;
   
   public Crime_Criminoso() {
     
    }


    public Crime_Criminoso(int id_crime, int id_criminoso) {
        this.id_crime = id_crime;
        this.id_criminoso = id_criminoso;
    }

    
    public int getId_crime() {
        return id_crime;
    }

    public void setId_crime(int id_crime) {
        this.id_crime = id_crime;
    }

    public int getId_criminoso() {
        return id_criminoso;
    }

    public void setId_criminoso(int id_criminoso) {
        this.id_criminoso = id_criminoso;
    }
   
}
