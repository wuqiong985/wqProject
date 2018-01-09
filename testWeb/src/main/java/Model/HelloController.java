package Model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/11/29.
 */
@WebServlet("/hello.do")
public class HelloController extends HttpServlet {
    private HelloModel helloModel = new HelloModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String message = helloModel.doHello(user);
        req.setAttribute("message",message);
        req.getRequestDispatcher("helloView.view").forward(req,resp);
    }
}
