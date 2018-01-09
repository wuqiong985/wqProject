package RegisterAndLogin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by wuqiong6 on 2017/12/1.
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {

    Properties props = new Properties();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username")+"1";
        String password = req.getParameter("password");
//        InputStream in = getClass().getResourceAsStream("user.properties");
//        System.out.println("qwq");
//        props.load(in);
//        System.out.println("qwq");
//        String propUserName = props.getProperty("username");
//        String propPassword = props.getProperty("password");
        System.out.println(username+" "+password);

//        req.setAttribute("username",username);

        if ((username.equals("wq1"))&&(password.equals("wq"))){
            System.out.println("hello");
            req.getRequestDispatcher("member.jsp").forward(req,resp);
        } else {
            resp.sendRedirect("error.jsp");
        }
//        in.close();
    }
}
