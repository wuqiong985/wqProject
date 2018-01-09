import check.AccountBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2017/11/27.
 */
public class DengLuServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        AccountBean account  = new AccountBean();
        String userName = req.getParameter("username");
        String password = req.getParameter("pwd");
        account.setUsername(userName);
        account.setPassword(password);
        if((userName != null)&&(userName.trim().equals("jsp"))) {
            if ((password != null) && (password.trim().equals("1"))) {
                System.out.println("success");
                session.setAttribute("account", account);
                String login_suc = "success.jsp";
                resp.sendRedirect(login_suc);
                return;
            }
        }
        String login_fail = "fail.jsp";
        resp.sendRedirect(login_fail);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
