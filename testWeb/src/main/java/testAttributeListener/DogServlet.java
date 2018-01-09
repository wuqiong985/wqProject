package testAttributeListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/12/6.
 */
@WebServlet("/testAttributeServlet.do")
public class DogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Dog d = new Dog("shengyu",2);
        Dog d2 = new Dog("sds",3);
        HttpSession session = req.getSession();
        session.setAttribute("dog",d);
        PrintWriter out = resp.getWriter();
        out.println(d.getName()+" "+d.getAge());
        session.setAttribute("dog",d2);
        session.removeAttribute("dog");

        Person p = new Person("Wq",22);
        session.setAttribute("person",p);
        session.removeAttribute("person");
    }
}
