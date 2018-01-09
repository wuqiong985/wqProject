package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by wuqiong6 on 2018/1/5.
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);
        String name = req.getParameter("user");
        String password = req.getParameter("password");
        System.out.println("name:"+name+",password:"+password);

        String interesting1 = req.getParameter("interesting");
        System.out.println(interesting1);

        //获取多个值
        String[] interestings = req.getParameterValues("interesting");
        for(String interesting:interestings) {
            System.out.println(interesting);
        }

        //参数名的集合
        Enumeration<String> names = req.getParameterNames();
        while(names.hasMoreElements()){
            String name2 = names.nextElement();
            System.out.println("^^"+name2+":"+req.getParameter(name2));
        }

        //获取集合
        Map<String,String[]> map = req.getParameterMap();
        for(Map.Entry<String,String[]> entry:map.entrySet()){
            System.out.println("**"+entry.getKey()+":"+ Arrays.asList(entry.getValue()));
        }

        //获取请求的URL
        HttpServletRequest httpServletRequest = (HttpServletRequest)req;
        String requestURI = httpServletRequest.getRequestURI();


        //获取请求的方式
        String method = httpServletRequest.getMethod();
        System.out.println(requestURI+","+method);

        /*
        response
         */

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
