package genericServlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2018/1/5.
 */
public abstract class MyServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    private ServletConfig servletConfig;

    public abstract void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException;

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
