package testCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by wuqiong6 on 2018/1/4.
 */
@WebServlet("/cookieDemo")
public class CookieDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        if (cookies != null){
            out.println("您上次的访问时间是：");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("lastAccessTime")){
                    Long lastAccessTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastAccessTime);
                    out.println(date);
                }
            }
        }else{
            out.println("这是第一次访问");
        }

        Cookie cookie = new Cookie("lastAccessTime",System.currentTimeMillis()+"");

        resp.addCookie(cookie);
    }
}
