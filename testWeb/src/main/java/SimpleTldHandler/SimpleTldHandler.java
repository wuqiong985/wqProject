package SimpleTldHandler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by wuqiong6 on 2017/12/20.
 */
public class SimpleTldHandler extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("Message from doTag()");
        getJspContext().getOut().print("About to throw an exception");
        throw new SkipPageException();
    }
}
