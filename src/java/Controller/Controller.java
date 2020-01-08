/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.*;
import ModelDAO.*;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.hibernate.validator.internal.util.privilegedactions.ConstructorInstance.action;

/**
 *
 * @author USER
 */
@WebServlet(name = "Controller", urlPatterns = {"Controller"})
public class Controller extends HttpServlet {
    String listar_criminoso="views/listar_criminoso.jsp";
    String  add_criminoso = "views/add_criminoso.jsp";
    String listar_vitima="views/listar_vitima.jsp";
    String  add_vitima = "views/add_vitima.jsp";
     String  add_crime = "views/add_crime.jsp";
    String  principal = "views/principal.jsp";
      Criminoso criminoso = new Criminoso();
      Pessoa pessoa = new Pessoa();
       Crime crime = new Crime();
       Vitima vitima = new Vitima();
       Crime_Criminoso cri_noso = new  Crime_Criminoso();
       Crime_Vitima cri_viti = new Crime_Vitima();
        VitimaDAO vitimaDao = new VitimaDAO();
     CriminosoDAO crimDao = new CriminosoDAO();
     PessoaDAO pessoaDao = new PessoaDAO();
      CrimeDAO crimeDao = new CrimeDAO();
   
  
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
          String action=request.getParameter("action");
          if(action.equalsIgnoreCase("cadastro_criminoso")){
            String nome =request.getParameter("nome");
            String data = request.getParameter("dataNascimento");
            String genero = request.getParameter("genero");
            String bi = request.getParameter("bi");
            String apelido = request.getParameter("apelido");
            String bairro = request.getParameter("bairro");
            pessoa.setNome(nome);
            pessoa.setDataNascimento(data);
            pessoa.setGenero(genero);
           pessoa.setImagem("aaaaaaaaa");
           pessoa.setBI(bi);
           pessoaDao.add(pessoa);
           int id_pessoa = pessoaDao.retornar_ultimiId();
            criminoso.setId_pessoa(id_pessoa);
            criminoso.setApelido(apelido);
            criminoso.setBairro(bairro);
            crimDao.add(criminoso);
            int id_crime = Integer.parseInt(request.getParameter("id_crime"));
            int id_criminoso = crimDao.retornar_ultimiId();
            cri_noso.setId_crime(id_crime);
            cri_noso.setId_criminoso(id_criminoso);
            crimDao.add_crime_criminoso(cri_noso);
            
            response.sendRedirect("Controller?action=add_criminoso");
            //String dado = request.getParameter("id_crime");
                 //response.getWriter().print("Bairro"+dado);
               
            
          }else if(action.equalsIgnoreCase("cadastro_crime"))
          {
               String bairro_crime = request.getParameter("bairro_crime");
               String tipo_crime = request.getParameter("tipo_crime");
                String data = request.getParameter("data");
                 String hora_crime = request.getParameter("hora_crime");
                 String descricao_crime = request.getParameter("descricao_crime");
                 crime.setLocal(bairro_crime);
                 crime.setTipo_crime(tipo_crime);
                 crime.setDescricao(descricao_crime);
                 crime.setData(data);
                 crime.setHora(hora_crime);
                 crimeDao.add(crime);
                 response.sendRedirect("Controller?action=add_criminoso");
              
              
          }else if(action.equalsIgnoreCase("cadastrar_vitima")){
              String nome =request.getParameter("nome");
            String data = request.getParameter("dataNascimento");
            String genero = request.getParameter("genero");
            String bi = request.getParameter("bi");
            String bairro = request.getParameter("bairro");
             String estado_vitima = request.getParameter("estado_vitima");
             pessoa.setNome(nome);
            pessoa.setDataNascimento(data);
            pessoa.setGenero(genero);
           pessoa.setImagem("aaaaaaaaa");
           pessoa.setBI(bi);
           vitima.setEstado(estado_vitima);
           vitima.setBairro(bairro);
            pessoaDao.add(pessoa);
            int id_pessoa = pessoaDao.retornar_ultimiId();
          vitima.setId_pessoa(id_pessoa);
           vitimaDao.add(vitima);
           int id_crime = Integer.parseInt(request.getParameter("id_crime"));
            int id_vitima = vitimaDao.retornar_ultimiId();
             cri_viti.setId_vitima(id_vitima);
            cri_viti.setId_crime(id_crime);
           
            vitimaDao.add_crime_vitima(cri_viti);
           
           response.sendRedirect("Controller?action=add_vitima");
              
          }else if(action.equalsIgnoreCase("cadastrar_policial")){
              /* String nome =request.getParameter("nome");
            String data = request.getParameter("data");
            String genero = request.getParameter("genero");
            String bi = request.getParameter("bi");
            String email = request.getParameter("email");
             String senha = request.getParameter("senha");*/
              response.getWriter().print("maaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
             
                 //response.getWriter().print("nome =>"+nome+"data=>"+data+"genero =>"+genero+"bi =>"+bi+"email =>"+email+"senha =>"+email);
              
          }
            
            
          
         
          
      }
      
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acesso ="";
         String action=request.getParameter("action");
         if(action.equalsIgnoreCase("guardar_vitima")){
             acesso = listar_criminoso;  
         }else if(action.equalsIgnoreCase("listar_criminoso")){
            
            acesso = listar_criminoso;
        }else if(action.equalsIgnoreCase("add_criminoso")){
              acesso = add_criminoso;   
            }else if(action.equalsIgnoreCase("principal")){
              acesso = principal;   
            }else if(action.equalsIgnoreCase("listar_vitima")){
                acesso = listar_vitima;
            }else if(action.equalsIgnoreCase("add_vitima")){
                acesso = add_vitima;
            }
         else if(action.equalsIgnoreCase("add_crime")){
                acesso = add_crime;
            }
        RequestDispatcher view = request.getRequestDispatcher(acesso);
        view.forward(request, response);
        processRequest(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
   /* protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acesso="";
        String action=request.getParameter("action");
        if(action.equalsIgnoreCase("listar")){
            acesso=listar;
        }else if(action.equalsIgnoreCase("add")){
            request.setAttribute("idprop", request.getParameter("id"));
            acesso=add;
        }else if(action.equalsIgnoreCase("Seguinte")){
            String nome=request.getParameter("nome");
            float preco=Float.parseFloat(request.getParameter("preco"));
            String tipo=request.getParameter("tipo");
            ut.setNome(nome);
            ut.setPreco(preco);
            ut.setTipo(tipo);
            dao.add(ut);
            acesso=upload;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idut", request.getParameter("id"));
            request.setAttribute("idprop", request.getParameter("idprop"));
            acesso=edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("id"));
            String nome=request.getParameter("nome");
            float preco=Float.parseFloat(request.getParameter("preco"));
           
            
            ut.setId(id);
            ut.setNome(nome);
            ut.setPreco(preco);
            
            dao.edit(ut);
            acesso=listar;
           
        }else if(action.equalsIgnoreCase("apagar")){
            id=Integer.parseInt(request.getParameter("id"));
            request.setAttribute("idprop", request.getParameter("idprop"));
            ut.setId(id);
            dao.delet(id);
            acesso=listar;
        }
        RequestDispatcher view=request.getRequestDispatcher(acesso);
        view.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acesso="";
        String action=request.getParameter("action");
        if(action.equalsIgnoreCase("entrar")){
            String nome=request.getParameter("nome");
            String email=request.getParameter("email");
            acesso=listar;
        }else if(action.equalsIgnoreCase("add")){
            acesso=add;
        }else if(action.equalsIgnoreCase("Seguinte")){
            String nome=request.getParameter("nome");
            float preco=Float.parseFloat(request.getParameter("preco"));
            String tipo=request.getParameter("tipo");
            int idprop=Integer.parseInt(request.getParameter("idprop"));
            request.setAttribute("idprop", request.getParameter("idprop"));
            ut.setNome(nome);
            ut.setPreco(preco);
            ut.setTipo(tipo);
            ut.setId_prop(idprop);
            dao.add(ut);
            int idarq=dao.retornaid(nome,tipo,preco);
            //request.setAttribute("nomep", request.getParameter("nome"));
           // request.setAttribute("emailp", request.getParameter("email"));
            String idarqui=""+idarq;
            request.setAttribute("idarq", idarqui);
            acesso=upload;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idut", request.getParameter("id"));
            request.setAttribute("idprop", request.getParameter("idprop"));
            acesso=edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("id"));
            String nome=request.getParameter("nome");
            float preco=Float.parseFloat(request.getParameter("preco"));
            request.setAttribute("idprop", request.getParameter("idprop"));
            
            ut.setId(id);
            ut.setNome(nome);
            ut.setPreco(preco);
            
            dao.edit(ut);
            acesso=listar;
           
        }else if(action.equalsIgnoreCase("apagar")){
            id=Integer.parseInt(request.getParameter("id"));
            ut.setId(id);
            dao.delet(id);
            acesso=listar;
        }
        RequestDispatcher view=request.getRequestDispatcher(acesso);
        view.forward(request, response);
        processRequest(request, response);
    }*/

   
  
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
