package testCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2018/1/3.
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        if (("wq".equals(user))&&("123456".equals(password))){
            String login = req.getParameter("autoLogin");
            if ("auto".equals(login)){
                Cookie cookie = new Cookie("user",user);
                cookie.setMaxAge(7*24*60*60);
                resp.addCookie(cookie);
            }
            req.setAttribute("user",user);
            req.getRequestDispatcher("user.view").forward(req,resp);
        }
        else{
            resp.sendRedirect("login.html");
        }
    }
}
