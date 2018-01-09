package testFilter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wuqiong6 on 2017/12/26.
 */
public class HelloFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init...");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter...");
        PrintWriter out = servletResponse.getWriter();
        out.println("Filter'output");
    }

    public void destroy() {
        System.out.println("destroy");
    }
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("Filter init...");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("doFilter...");
//        PrintWriter out = servletResponse.getWriter();
//        out.println("Filter'output");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destroy");
//    }
}
