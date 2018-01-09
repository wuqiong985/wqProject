package Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/11/28.
 */
@WebServlet("/some.view")
public class some extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Some do one...");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("other.view");
        requestDispatcher.include(req,resp);
        out.println("Some do two...");
        out.close();
    }
}
