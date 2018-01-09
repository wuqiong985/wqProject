import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by wuqiong6 on 2017/11/24.
 */
public class ResponseDemo4 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("content-type","text/html;charset=UTF-8");
//        String data = "重定向不过去";
//        OutputStream out = resp.getOutputStream();
//        out.write(data.getBytes());
//        System.out.println("what's wrong");

        //相对于web工程的目录 重定向
        //req.getContextPath() 表示http://localhost:8080/testweb webapps 目录
//        resp.sendRedirect(req.getContextPath()+"/index.jsp");

        this.getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
