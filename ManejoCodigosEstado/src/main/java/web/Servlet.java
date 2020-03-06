/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author beamora
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Simular los valores correctos 
        String usuarioOk = "Andres";
        String passwordOk = "1019112739";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos Correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Usuario: " + password);
            out.print("</h1>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas.");
        }
    }
}
