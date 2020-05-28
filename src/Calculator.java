import java.io.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculator extends HttpServlet {

     protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
               throws ServletException, IOException {

          response.setContentType("text/html");
          PrintWriter out = response.getWriter();

          String n1 = request.getParameter("number1");
          String n2 = request.getParameter("number2");
          String op = request.getParameter("op");

          int a = 0;
          int b = 0;
          int c = 0;

          try {
               a = Integer.parseInt(n1);
          } catch (Exception e) {
               a = 0;
          }
          try {
               b = Integer.parseInt(n2);
          } catch (Exception e) {
               b = 0;
          }
          switch (op) {
               case "Addition":
                    c = a + b;
                    break;
               case "Subtraction":
                    c = a - b;
                    break;
               case "Multiplication":
                    c = a * b;
                    break;
               case "Division":
                    c = a / b;
          }

          out.print("<!DOCTYPE html><html lang='en'><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'>");
          out.print("<title>Servlet: Basic Calcualtor</title><link rel='stylesheet' href='style.css'>");
          out.print("</head> <body><form action='calculator.html' method='post'><center><table id='cus_table1'><caption> <h1>Basic Calculator</h1></caption>");
          out.print("<tr><td>Result is</td> <td><input name='number1' type='text'value='"+c+"' readonly></td>");
          out.print("</tr><tr><td colspan='2' align='center'> <input type='submit' value='Back'></td></tr></table></center></form></body></html>");

     }
}