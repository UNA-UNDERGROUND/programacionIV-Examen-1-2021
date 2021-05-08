/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempos.frontend.administrador;

import tiempos.backend.Controlador;
import tiempos.backend.estructuras.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author jonguz
 */
@WebServlet(name = "ganadorAdminController", urlPatterns = {"/admin-numero-ganador", "/admin-ganador"})
public class numeroGanador extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("credenciales", new Usuario());
        String viewUrl = "";
        switch (request.getServletPath()) {
            case "/admin-numero-ganador":
                viewUrl = this.procPost(request);
                break;
            case "/admin-ganador":
                viewUrl = this.show(request);
                break;
        }
        request.getRequestDispatcher(viewUrl).forward(request, response);
    }
    
    public String show(HttpServletRequest request) {
        return this.showAction(request);
    }

    public String showAction(HttpServletRequest request) {
        return "/presentation/administrador/numeroGanador.jsp";
    }

    public String procPost(HttpServletRequest request) {
        return this.postAction(request);
    }

    public String postAction(HttpServletRequest request) {
        updateModel(request);
        return "/presentation/index.jsp";
    }

    void updateModel(HttpServletRequest request) {
        //numero monto sorteo
        //Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        Integer numeroGanador = Integer.parseInt(request.getParameter("sorteo"));
        String numeroSorteo = request.getParameter("numero");

        Controlador controlador = Controlador.getInstancia();

        controlador.agregarGanador(new BigInteger(numeroSorteo), numeroGanador);

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
