/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author beamora
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //Simular los valores correctos 
    }
}
