package TestListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/12/4.
 */
@WebServlet("/Listener.do")
public class ListenerTester extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("text context attributes set by listener<br>");
        out.println("<br>");
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        out.println("Dog's breed is:" + dog.getBreed());
    }
}
