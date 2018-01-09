package dao;

import student.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuqiong6 on 2018/1/8.
 */
public class StudentDao {

    public List<Student> getAll(){

        List<Student> students = new ArrayList<Student>();
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String url = "jdbc:mysql://localhost:3333/tets";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","root");

            String sql = "select flow_id, type, id_card, exam_card, student_name, location, grade " +
                    "from examstudent";

            statement = conn.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()){
                int flowId = resultSet.getInt(1);
                int type = resultSet.getInt(2);
                String idCard = resultSet.getString(3);
                String examCard = resultSet.getString(4);
                String studentName = resultSet.getString(5);
                String location = resultSet.getString(6);
                int grade = resultSet.getInt(7);
                Student student = new Student(flowId,type,idCard,examCard,studentName,location,grade);
                students.add(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return students;
    }

    public void deleteByFlowId(Integer flowId){
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String url = "jdbc:mysql://localhost:3333/tets";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","root");

            String sql = " delete from examstudent where flow_id = ?";

            statement = conn.prepareStatement(sql);

            statement.setInt(1,flowId);

            statement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
