import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Greetings extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
    res.setContentType("text/html");
    PrintWriter p=res.getWriter();
    p.println("<html><head><title>HELLO!</title><style>");
    p.println("*{margin: 0; padding: 0; box-sizing: border-box;font-family: 'Lucida Console', Monaco, monospace;}");
    p.println("header{width: 100% ; height: 100vh;background-image: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.1)), url('https://www.amity.edu/raipur/images/raipur.jpg');");
    p.println("background-repeat: no-repeat;background-size: 100%;}");
    p.println("main {width: 100%; height: 85vh;display: flex;justify-content: center;align-items: center;text-align: center;}");
    p.println("section {line-height: 400%;items-align: right;}");
    p.println("section h2 {font-size: 60px; letter-spacing: 1px; word-spacing: 3.5px;color: white;text-shadow: 1px 1px 2px black;}");
    p.println("</style></head><body><header><main><section>");
    p.println("<h2>Welcome, user!</h2>");
    p.println("<button style='font-size:20px'><a href='http://localhost:82/web_dev/week_10/home.html'>Go to Home</a></button>");
    p.println("</section></main></header></body></html>");
    p.close();
  }
}
