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
public class Crime {
    String local;
    String tipo_crime;
    String descricao;
    String data;
    String hora;
    int id;
    
        public Crime() {
            
            }

    public Crime(String local, String tipo_crime, String descricao, String data, String hora,int id) {
        this.local = local;
        this.tipo_crime = tipo_crime;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTipo_crime() {
        return tipo_crime;
    }

    public void setTipo_crime(String tipo_crime) {
        this.tipo_crime = tipo_crime;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
