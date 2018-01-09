package Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuqiong6 on 2017/11/29.
 */
public class HelloModel {
    private Map<String ,String> messages = new HashMap<String, String>();

    public HelloModel(){
        messages.put("caterpillar","Hello");
        messages.put("Justin","Welcome");
        messages.put("momor","Hi");
    }
    public String doHello(String user){
        String message = messages.get(user);
        return message+","+user;
    }
}
