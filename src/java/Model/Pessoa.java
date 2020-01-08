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
public class Pessoa {
    String nome;
    String dataNascimento;
    String genero;
    String imagem;
    String BI;
     public Pessoa() {
        
    }

    public Pessoa(String nome, String dataNascimento, String genero, String imagem, String BI) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.imagem = imagem;
        this.BI = BI;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }
    
}
