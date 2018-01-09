package CookieTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/12/6.
 */
@WebServlet("/checkcookie.do")
public class CheckCookie extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        Cookie[] cookies = req.getCookies();

        System.out.println(cookies.length);

        if (cookies != null){
            for (int i = 0; i < cookies.length; i++){
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("username")){
                    String userName = cookie.getValue();
                    out.println("Hello" + userName);
//                    break;
                }
            }
        }
    }
}
