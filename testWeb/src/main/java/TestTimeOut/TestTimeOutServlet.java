package TestTimeOut;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/12/5.
 */
@WebServlet("/timeout.do")
public class TestTimeOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        session.setAttribute("wq","wq");

        out.println(session.getAttribute("wq")+" before");

//        session.invalidate();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        out.println(session.getAttribute("wq")+" after");


    }
}
