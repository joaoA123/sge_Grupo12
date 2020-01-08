
package Interfaces;

import Model.Propietario;
import java.util.List;


public interface CRUD {
    public List listar();
    public Propietario list(int id);
    public boolean add(Propietario ut);
    public boolean edit(Propietario ut);
    public boolean delet(int id);
    public boolean act(int a);
    public int getid(String email, String senha);
}
