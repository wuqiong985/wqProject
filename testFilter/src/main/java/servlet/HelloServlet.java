package servlet;

import jdk.internal.util.xml.impl.Input;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by wuqiong6 on 2017/12/29.
 * 测试servletContext的方法
 */
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();
        ServletContext servletContext = servletConfig.getServletContext();

        //servletContext可以被所有的servlet所获取
        String name= servletContext.getInitParameter("name");
        System.out.println(name);
        Enumeration<String> names = servletContext.getInitParameterNames();
        while (names.hasMoreElements()){
            String name1 = names.nextElement();
            System.out.println("-->"+name1);
        }

        //获取绝对路径，在服务器上的绝对路径
        String realPath = servletContext.getRealPath("/1.txt");
        System.out.println(realPath);

        //获取当前web应用的名称
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

        //获取当前web应用的某一个文件对应的输入流
        //getResourceAsStream(String path) path的/为当前Web应用的根目录

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        System.out.println("1."+is);

        InputStream is2 = servletContext.getResourceAsStream("jdbc.properties");
        System.out.println("2."+is2);

        PrintWriter out = resp.getWriter();
        out.println("Hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
