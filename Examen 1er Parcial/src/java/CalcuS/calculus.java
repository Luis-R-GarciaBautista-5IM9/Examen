
package CalcuS;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;

public class calculus extends HttpServlet{
    
    public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
    throws   ServletException,   IOException
    {
    double   num1,   result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num1"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcular(num1,operacion);

    out.println("<html>");
    out.println("<head><title>.:CalculadoraServlet:.</title></head>");
    out.println("<body>");
    out.println("<h1><center>El resultado es</center></h1>");
    out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   calcular(double   num1,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1   *  20;
            
        case   2:
            return   num1   *  0.20;
            
        }

    return   result;
    }
}
