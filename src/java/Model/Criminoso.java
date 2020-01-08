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
public class Criminoso extends Pessoa {
    int id_pessoa;
    String Apelido;
    String Bairro;
     public Criminoso() {
        
    }

   /* public Criminoso(int id_pessoa, String Apelido, String Bairro) {
        this.id_pessoa = id_pessoa;
        this.Apelido = Apelido;
        this.Bairro = Bairro;
    }*/

   

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    
}
