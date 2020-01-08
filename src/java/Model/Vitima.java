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
public class Vitima extends Pessoa {
     int id_pessoa;
    String estado;
    String Bairro;
    
    
    public Vitima() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public Vitima(int id_pessoa, String estado, String Bairro) {
        this.id_pessoa = id_pessoa;
        this.estado = estado;
        this.Bairro = Bairro;
    }


    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    
}
