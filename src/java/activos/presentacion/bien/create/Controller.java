/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activos.presentacion.bien.create;

import Domain.Solicitud;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import activos.logic.Model;
/**
 *
 * @author Anthony
 */

@WebServlet(name = "activos.presentacion.bien.create", urlPatterns = {"/activos/presentacion/bien/create"})

public class Controller extends HttpServlet {

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
        
        if (request.getServletPath().equals("/presentation/personas/create"))
                this.create(request, response); 
    }

    protected void create(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {
        
        Solicitud unaSolicitud = new Solicitud();
        updateModel(unaSolicitud,request);
        try {
            Model.agregar(unaSolicitud);
            
        } catch (Exception ex) {
        }
        //tengo que ver hacia donde mandarlo una vez que crea la solicitud.
        //request.getRequestDispatcher("/presentation/personas/list").forward( request, response);
        
        
        
    }
    
    protected void updateModel(Solicitud unaSolicuitud,HttpServletRequest request){
        unaSolicuitud.setComprobante(request.getParameter("campoComprobante"));
        unaSolicuitud.setDependecia(request.getParameter("dependeciaID"));
        unaSolicuitud.setEstado("por verificar");//el estado debe setearse por verificar ya que es nueva.
        unaSolicuitud.setFecha(request.getParameter("campoFecha"));
        unaSolicuitud.setRegistrador(request.getParameter("registradorID"));//la solicitud tiene un registrador el cual es un usuario
        unaSolicuitud.setTipo(request.getParameter("campoTipo"));
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
