import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * Created by wuqiong6 on 2017/11/24.
 */
public class ResponseDemo2 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = this.getServletContext().getRealPath("图片.png");
        System.out.println(realPath);
        String fileName = realPath.substring(realPath.lastIndexOf("\\")+1);
        //设置content-disposition响应头控制浏览器以下载的形式打开文件
        resp.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode(fileName, "UTF-8"));
        InputStream in = new FileInputStream(realPath);
        int len = 0;
        byte [] buffer = new byte[1024];
        OutputStream out = resp.getOutputStream();
        while ((len = in.read(buffer)) > 0){
            out.write(buffer,0,len);
        }
        in.close();
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
