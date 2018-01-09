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
@WebServlet("/index.do")
public class Index extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies != null){
            for (Cookie cookie:cookies){
                String name = cookie.getName();
                String value = cookie.getValue();
                if(("user".equals(name))&& ("wq".equals(value))){
                    req.setAttribute("user","wq");
                    req.getRequestDispatcher("user.view").forward(req,resp);
                    return;
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
