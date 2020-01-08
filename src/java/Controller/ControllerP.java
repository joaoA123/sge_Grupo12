/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Propietario;
import ModelDAO.PropietarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ELVIS JR
 */
@WebServlet(name = "ControllerP", urlPatterns = {"/ControllerP"})
public class ControllerP extends HttpServlet {

    String listar="views/listar.jsp";
    String add="views/add.jsp";
    String edit="views/edit.jsp";
    String upload="views/upload.jsp";
    String index="index.jsp";
    String saveFile = "C:/upload/diversos";
    String pag="views/pag.jsp";
    String nome;
    String tipo;
    String preco;
    Propietario ut=new Propietario();
    PropietarioDAO dao=new PropietarioDAO();
    int id;
    
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acesso="";
        String action=request.getParameter("action");
        if(action.equalsIgnoreCase("listar")){
            acesso=listar;
        }else if(action.equalsIgnoreCase("add")){
            acesso=add;
        }else if(action.equalsIgnoreCase("Seguinte")){
            String nome=request.getParameter("nome");
            String email=request.getParameter("preco");
            String senha=request.getParameter("tipo");
            ut.setNome(nome);
            ut.setEmail(email);
            ut.setSenha(senha);
            dao.add(ut);
            acesso=upload;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idut", request.getParameter("id"));
            acesso=edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("id"));
            String nome=request.getParameter("nome");
            String email=request.getParameter("email");
            String senha=request.getParameter("senha");
            ut.setId(id);
            ut.setNome(nome);
            ut.setEmail(email);
            ut.setSenha(senha);
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
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acesso="";
        String action=request.getParameter("action");
        if(action.equalsIgnoreCase("entrar")){
         
            String senha=request.getParameter("senha");
            String email=request.getParameter("email");
            int idprop=0;
            ut.setNome(senha);
            ut.setEmail(email);
            idprop = dao.getid(email, senha);
            if(idprop>0){
                String idpr=""+idprop;
                request.setAttribute("idprop", idpr);
                acesso=listar;
            }else{
                acesso=index;
            }
            
            
        }else if(action.equalsIgnoreCase("add")){
            acesso=add;
        }else if(action.equalsIgnoreCase("Seguinte")){
            String nome=request.getParameter("nome");
            String email=request.getParameter("email");
            String senha=request.getParameter("senha");
            ut.setNome(nome);
            ut.setEmail(email);
            ut.setSenha(senha);
            dao.add(ut);
            request.setAttribute("nomep", request.getParameter("nome"));
           // request.setAttribute("emailp", request.getParameter("email"));
            acesso=upload;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idut", request.getParameter("id"));
            acesso=edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("id"));
            String nome=request.getParameter("nome");
            String email=request.getParameter("preco");
            
            ut.setId(id);
            ut.setNome(nome);
            ut.setEmail(email);
            
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
