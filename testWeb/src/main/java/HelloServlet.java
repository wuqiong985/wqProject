import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/11/27.
 */
@WebServlet("/hello.view")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
//        ServletConfig servletConfig = this.getServletConfig();
        String name = req.getParameter("name");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello! "+/*servletConfig.getInitParameter("name")*/name+"!</h1>");
        out.println(req.getContextPath()+"   "+req.getServletPath() +"   "+req.getPathInfo());
        out.println("</body>");
        out.println("</html>");
    }
}
