package servlet;

import dao.StudentDao;
import student.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by wuqiong6 on 2018/1/8.
 */
@WebServlet("/listAllStudents")
public class ListAllStudents extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = new StudentDao();
        List<Student> students = studentDao.getAll();

        req.setAttribute("students",students);
        req.getRequestDispatcher("/StudentInformation.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
