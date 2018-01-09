import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2017/11/23.
 */
public class ServletDemo3 extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = "<h1><font color='red'>Demo3的小标题</font></h1>";
        resp.setContentType("text/html;charset=UTF-8");
        resp.getOutputStream().write(data.getBytes());

//        ServletContext context = this.getServletContext();
//        //获取请求转发对象
//        RequestDispatcher rd = context.getRequestDispatcher("/demo4");
//        rd.forward(req,resp);

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
