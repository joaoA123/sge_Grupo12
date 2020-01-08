/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Arquivos;
import ModelDAO.ArquivoDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import util.Upload;

/**
 *
 * @author ELVIS JR
 */
@WebServlet(name = "ttt", urlPatterns = {"/ttt"})
public class ttt extends HttpServlet {

    String saveFile = "C:/upload/diversos";
    String pag="views/listar.jsp";
    String nome;
    String tipo;
    String preco;

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String acesso="";
        try {
            boolean ismultpart = ServletFileUpload.isMultipartContent(request);
            if (!ismultpart) {

            } else {
                //String nome=ServletFileUpload.MULTIPART_FORM_DATA;
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
           
                List items = null;
                try {
                    items = upload.parseRequest(request);
                } catch (Exception e) {

                }

                Iterator itr = items.iterator();
                while (itr.hasNext()) {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField()) {
                        
                       
                   } else {
                        String itemname = item.getName();
                        if ((itemname == null) || itemname.equals("")) {
                            continue;
                        }
                        String filename = FilenameUtils.getName(itemname);
                        int id=Integer.parseInt(request.getParameter("idarq"));
                        File f = checkExist(filename,id);
                        item.write(f);
                        
                    }
                }
                
                    Upload upi=new Upload();
               nome= upi.getForm().get("nome").toString();
               tipo=upi.getForm().get("tipo").toString();
               preco=upi.getForm().get("preco").toString();
              
               
            }
        } catch (Exception e) {

        }
          request.setAttribute("idprop", request.getParameter("id"));
          acesso=pag;
       RequestDispatcher view=request.getRequestDispatcher(acesso);
       view.forward(request, response);
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
        String nn=request.getParameter("nome");
        request.setAttribute("n", nn);
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
    //Função para verificar de determinado directorio existe e aonde o arquivo deve ser Salvo
    private File checkExist(String fileName, int id) {
        String tt = fileName;
        int aleatorio=0;
        if (tt.contains(".pdf") || tt.contains(".txt") || tt.contains(".docx") || tt.contains(".xlsx") || tt.contains(".pptx")) {
            String tpdoc = tt;
            if (tpdoc.contains(".pdf")) {
                aleatorio = (int)(Math.random() * 10000);
                String salvarpdf = "C:/upload/documentos/pdf/";
                File f = new File(salvarpdf + "/" +aleatorio+ "-" + fileName);
                if (f.exists()) {
                    StringBuffer sb = new StringBuffer(fileName);
                    sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                    f = new File(salvarpdf + "/" + sb.toString());
                }
                ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarpdf);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                ut.setFilename(fileName);
                dao.finalizar(ut);
               
                return f;
            } else if (tpdoc.contains(".txt")) {
                aleatorio = (int)(Math.random() * 10000);
                String salvartxt = "C:/upload/documentos/txt/";
                File f = new File(salvartxt + "/" +aleatorio+ "-" + fileName);
                if (f.exists()) {
                    StringBuffer sb = new StringBuffer(fileName);
                    sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                    f = new File(salvartxt + "/" + sb.toString());
                }
                ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvartxt);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
                return f;
            } else if (tpdoc.contains(".xlsx")) {
                aleatorio = (int)(Math.random() * 10000);
                String salvarexcel = "C:/upload/documentos/excel/";
                File f = new File(salvarexcel + "/" +aleatorio+ "-" + fileName);
                if (f.exists()) {
                    StringBuffer sb = new StringBuffer(fileName);
                    sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                    f = new File(salvarexcel + "/" + sb.toString());

                }
                 ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarexcel);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
                return f;
            } else if (tpdoc.contains(".docx")) {
                aleatorio = (int)(Math.random() * 10000);
                String salvarword = "C:/upload/documentos/word/";
                File f = new File(salvarword + "/" +aleatorio+ "-" + fileName);
                if (f.exists()) {
                    StringBuffer sb = new StringBuffer(fileName);
                    sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                    f = new File(salvarword + "/" + sb.toString());

                }
                 ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarword);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
                return f;
            } else if (tpdoc.contains(".pptx")) {
                aleatorio = (int)(Math.random() * 10000);
                String salvarpoint = "C:/upload/documentos/point/";
                File f = new File(salvarpoint + "/" +aleatorio+ "-" + fileName);
                if (f.exists()) {
                    StringBuffer sb = new StringBuffer(fileName);
                    sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                    f = new File(salvarpoint + "/" + sb.toString());

                }
                 ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarpoint);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
                return f;
            }
        } else if (tt.contains(".mp3") || tt.contains(".wav")) {
            aleatorio = (int)(Math.random() * 10000);
            String salvarmusi = "C:/upload/musicas/";

            File f = new File(salvarmusi + "/" +aleatorio+ "-" + fileName);

            if (f.exists()) {
                StringBuffer sb = new StringBuffer(fileName);
                sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                f = new File(salvarmusi + "/" + sb.toString());
            }
             ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarmusi);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
            return f;
        }else if(tt.contains(".png") || tt.contains(".jpeg") || tt.contains(".img") ){
            aleatorio = (int)(Math.random() * 10000);
            String salvarimagens = "C:/upload/imagens/";
            File f = new File(salvarimagens + "/" +aleatorio+ "-" + fileName);
            if (f.exists()) {
                StringBuffer sb = new StringBuffer(fileName);
                sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                f = new File(salvarimagens + "/" + sb.toString());
            }
             ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarimagens);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
            return f;
        }else if(tt.contains("avi") || tt.contains("mp4") || tt.contains("mpeg")){
            aleatorio = (int)(Math.random() * 10000);
            String salvarvideos = "C:/upload/videos/";
            File f = new File(salvarvideos + "/" +aleatorio+ "-" + fileName);

            if (f.exists()) {
                StringBuffer sb = new StringBuffer(fileName);
                sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
                f = new File(salvarvideos + "/" + sb.toString());
            }
             ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(salvarvideos);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
            return f;
        } 
        aleatorio = (int)(Math.random() * 10000);
        File f = new File(saveFile + "/" +aleatorio+ "-" + fileName);

        if (f.exists()) {
            StringBuffer sb = new StringBuffer(fileName);
            sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
            f = new File(saveFile + "/" + sb.toString());
        }
         ArquivoDAO dao=new ArquivoDAO();
                Arquivos ut=new Arquivos();
                ut.setCaminho(saveFile);
                ut.setId_arq(aleatorio);
                ut.setId(id);
                 ut.setFilename(fileName);
                dao.finalizar(ut);
        return f;
    }

    

}
