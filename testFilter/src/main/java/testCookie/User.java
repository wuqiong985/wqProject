package testCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2018/1/3.
 */
@WebServlet("/user.view")
public class User  extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        if (req.getAttribute("user")==null){
            resp.sendRedirect("login.html");
        }
        PrintWriter out = resp.getWriter();
        out.println("Servlet User");
        out.println("<h1>"+req.getAttribute("user")+"已登录</h1>");
        out.close();
    }
}
