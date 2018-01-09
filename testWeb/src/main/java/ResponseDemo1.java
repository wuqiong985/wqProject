import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/11/24.
 */
public class ResponseDemo1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        outputChineseByOutputStream(resp);
        outputOneByOutputStream(resp);
    }

    private void outputChineseByOutputStream(HttpServletResponse resp) throws IOException {
        /*
        使用OutputStream 和 resp.setHeader("content-type","text/html;charset=UTF-8");
         */
//        String data = "中国";
//        OutputStream outputStream = resp.getOutputStream();
//        //设置响应头来控制浏览器的行为
//        resp.setHeader("content-type","text/html;charset=UTF-8");
//        byte[] dataByteArr = data.getBytes("UTF-8");
//        outputStream.write(dataByteArr);

        /*
        使用PrintWriter输出，需要先转码
         */
/*        String data1 = "你好啊 wqqqq";
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
       resp.setHeader("content-type","text/html;charset=UTF-8");
//        out.print("<meta http-equiv='content-type' content='text/html;charset=UTF-8'/>");
        out.write(data1);
        System.out.println("hello");*/
    }

    /**
     *
     * @param resp
     * @throws IOException
     * 使用两种方法输出数字，都需要先将数字转换为字符串
     */
    private void outputOneByOutputStream(HttpServletResponse resp) throws IOException {
        /*resp.setHeader("content-type","text/html;charset=UTF-8");
        OutputStream outputStream = resp.getOutputStream();
        outputStream.write("使用OutputStream流输出数字：".getBytes());
        outputStream.write("1".getBytes());*/

        resp.setHeader("content-type","text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("使用OutputStream流输出数字：");
        printWriter.write("2");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
