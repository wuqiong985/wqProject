package Counter;

/**
 * Created by wuqiong6 on 2017/12/6.
 */
public class Counter {
    private static int count;
    public static synchronized int getCount(){
        count++;
        return count;
    }
}
