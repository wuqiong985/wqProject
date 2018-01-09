package TestAdviceTaglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2017/12/18.
 */
public class AdvisorTagHandler extends SimpleTagSupport {

    private String user;

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("hello" + user +" <br>");
        getJspContext().getOut().write("your advice is:"+getAdvice());
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String getAdvice() {
        String[] adviceStrings = {"A","B","C"};
        int random = (int)(Math.random() * adviceStrings.length);
        return adviceStrings[random];
    }


}
