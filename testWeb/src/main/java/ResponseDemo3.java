import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by wuqiong6 on 2017/11/24.
 */
public class ResponseDemo3 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("refresh","0.01");
        
        //内存中创建一张图片
        BufferedImage bufferedImage = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);

        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,80,20);
        g.setColor(Color.BLUE);
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeNum(),0,20);
        resp.setContentType("image/jpeg");

        resp.setDateHeader("expries",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");
        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());


        
    }

    private String makeNum() {
        String num = new Random().nextInt(9999999)+"";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 7-num.length(); i++) {
            sb.append("0");
        }

        num = sb.toString()+num;
        return num;

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
