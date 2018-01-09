package example.web;

import example.model.BeerExpert;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wuqiong6 on 2017/12/1.
 */
public class BeerSelect extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Beer Selection Advice<br>");
        String c = req.getParameter("color");

        BeerExpert be =  new BeerExpert();
        List result = be.getBrands(c);

        req.setAttribute("styles",result);
        req.getRequestDispatcher("beerResult.jsp").forward(req,resp);

//        out.println("<br>Got beer color:"+c);
//        Iterator i = result.iterator();
//        while (i.hasNext()){
//            out.println("<br>try: "+i.next());
//        }
    }
}
