/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempos.frontend.cliente;



import tiempos.backend.Controlador;
import tiempos.backend.estructuras.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonguz
 */
@WebServlet(name = "ApuestasClienteController", urlPatterns = {"/cliente-apuestas"})
public class ApuestasCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("credenciales", new Usuario());
        String viewUrl = this.show(request);
        request.getRequestDispatcher(viewUrl).forward(request, response);
    }

    boolean validarCampos(HttpServletRequest request) {
        Map<String, String> errores= new HashMap<>();
        if (request.getParameter("usuario").isEmpty() ) {
            errores.put("usuario", "cedula requerida");
        }
        else{
            try{
                Integer.parseInt(request.getParameter("usuario"));
            }
            catch(NumberFormatException e){
                errores.put("usuario", "formato de cedula incorrecto");
            }
        }
        if (request.getParameter("pass").isEmpty()) {
            errores.put("pass", "contraseña requerida");
        }
        request.setAttribute("errores", errores);
        return errores.isEmpty();
    }

    public String show(HttpServletRequest request) {
        return this.showAction(request);
    }

    public String showAction(HttpServletRequest request) {
        return "/presentation/cliente/verApuestas.jsp";
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
        processRequest(request, response);
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
