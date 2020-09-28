/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 798676
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("text", "---");    
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String first = request.getParameter("first");
      String second = request.getParameter("second");
      int num1 = 0;
      int num2 = 0;
      if(first == null || first.equals("") || second == null || second.equals("")){
          request.setAttribute("text","invalid");
          
      }
      else{
        String calcType = request.getParameter("calcType");
        try{
            num1 = Integer.parseInt(first);
            num2 = Integer.parseInt(second);
            int calc = 0;
        switch (calcType){
            case "+":
                calc = num1 + num2;
                break;
            case "-":
                calc = num1 - num2;
                break;
            case "*":
                calc = num1 * num2;
                break;
            case "%":
                calc = num1 % num2;
                break;
        }
        request.setAttribute("text",calc);
        }
        catch(NumberFormatException e){
            request.setAttribute("text","invalid");
        }
        
      }
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

   


}
