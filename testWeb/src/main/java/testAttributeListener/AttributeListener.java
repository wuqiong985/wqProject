package testAttributeListener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by wuqiong6 on 2017/12/6.
 */
public class AttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("Attribute added: "+name +" : "+value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("Attribute Removed: "+name +" : "+value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("Attribute Replaced: "+name +" : "+value);
    }
}
