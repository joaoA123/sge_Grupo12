/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ELVIS JR
 */
public class Arquivos {
    String nome;
    String tipo;
    int id_prop;
    float preco;
    String data;
    int id_arq;
    int id;
    String filename;
    String caminho;

    public Arquivos() {
    }

    public Arquivos(String nome, String tipo, int id_prop, float preco, String data,int id,int id_arq, String caminho,String filename) {
        this.nome = nome;
        this.tipo = tipo;
        this.id_prop = id_prop;
        this.preco = preco;
        this.data = data;
        this.id=id;
        this.id_arq=id_arq;
        this.caminho=caminho;
        this.filename=filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_prop() {
        return id_prop;
    }

    public void setId_prop(int id_prop) {
        this.id_prop = id_prop;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_arq() {
        return id_arq;
    }

    public void setId_arq(int id_arq) {
        this.id_arq = id_arq;
    }
    
    
    
}
