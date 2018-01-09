package upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by wuqiong6 on 2017/11/27.
 */
@MultipartConfig
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("photo");
        String filename = getFileName(part);
        writeTo(filename,part);
    }

    private void writeTo(String filename, Part part) throws IOException {
        InputStream in = part.getInputStream();
        OutputStream out = new FileOutputStream("d:/testUpload/"+filename);
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length=in.read(buffer)) != -1){
            out.write(buffer,0,length);
        }
        in.close();
        out.close();
    }

    private String getFileName(Part part) {
        String header = part.getHeader("Content-Disposition");
        String filename = header.substring(header.indexOf("filename=\"")+10,header.lastIndexOf("\""));
        return filename;
    }


}
