/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Model.Arquivos;
import java.util.List;

/**
 *
 * @author ELVIS JR
 */
public interface CRUDA {
    public List listar(int a);
    public Arquivos list(int id);
    public boolean add(Arquivos ut);
    public boolean edit(Arquivos ut);
    public boolean finalizar(Arquivos ut);
    public boolean delet(int id);
    public boolean act(int a);
    public int retornaid(String nome, String tipo, float preco);
    
}
