import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2017/11/23.
 */
public class ServletContextDemo1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = "ServletContextDemo1's data...";
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("data",data);
        //
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().print("赋值成功！");
        System.out.println("赋值成功！");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
